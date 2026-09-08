class Solution {
    public int maxProfit(int[] prices) {
      int n = prices.length;
      int[][] dp = new int[n+1][5];
      for(int i=n-1; i>=0; i--){
        for(int k=1; k<=4; k++){
        if(k%2==0){
            dp[i][k] = Math.max(dp[i+1][k-1]-prices[i],dp[i+1][k]);
        }
        else{
        dp[i][k] = Math.max(dp[i+1][k-1]+prices[i],dp[i+1][k]);
      }}}
      return dp[0][4];
    }
}