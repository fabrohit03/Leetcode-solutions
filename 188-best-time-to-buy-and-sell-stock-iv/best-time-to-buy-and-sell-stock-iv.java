class Solution {
    public int maxProfit(int k,int[] prices) {
      int n = prices.length;
      int [][] dp = new int[n+1][2*k+1];
      int ops = 2*k;
      for(int i=n-1; i>=0; i--){
        for(int op=1; op<=ops; op++){
            if(op%2==0){
                dp[i][op] = Math.max(dp[i+1][op-1]-prices[i],dp[i+1][op]);
            }else{
                dp[i][op] = Math.max(dp[i+1][op-1]+prices[i],dp[i+1][op]);
            }
        }
      }
      return dp[0][ops];
    }
}
