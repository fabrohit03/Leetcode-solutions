class Solution {
    public int uniquePaths(int m, int n) {
       int [] dp = new int[m];
       dp[m-1] = 1;
       for(int i = n-1; i>=0; i--){
        for(int j = m-2; j>=0; j--){
            dp[j] = dp[j]+dp[j+1];
        }
       }
       return dp[0];
    }
}