class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [] [] dp = new int [n][3];
        for(int [] rows: dp){
            Arrays.fill(rows,-1);
        }
        
        int k =2;
        return func(prices,n,0,k,dp);
    }
    private int func(int[] prices, int n , int i , int k, int[] [] dp){
        if(i==n) return 0;
        if(k==0) return 0;
        if(dp[i][k]!=-1) return dp[i][k];
        if(k==2){
            int c1 = func(prices,n,i+1,k-1,dp)-prices[i];
            int c2 = func(prices,n,i+1,k,dp);
            return dp[i][k]=Math.max(c1,c2);
        }else{
            int c1 = func(prices,n,i+1,k-1,dp)+prices[i];
            int c2 = func(prices,n,i+1,k,dp);
            return dp[i][k]=Math.max(c1,c2);
        }
    
    }
}