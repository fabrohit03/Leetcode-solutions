class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        long[][] dp = new long[n][amount+1];
       for(int t=0; t<=amount; t++){
        if(t%coins[0]==0){
            dp[0][t]=1;
        }else{
            dp[0][t]=0;
        }
       }
       for(int idx=1; idx<n; idx++){
        for(int t=0; t<=amount; t++){
            long notTake=dp[idx-1][t];
        
        long take=0;
        if(coins[idx]<=t){
            take = dp[idx][t-coins[idx]];
        }
        dp[idx][t]=take+notTake;
       }}
       return (int) dp[n-1][amount];
    }
}