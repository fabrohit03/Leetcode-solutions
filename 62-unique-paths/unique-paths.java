class Solution {
    int func(int i, int j, int n, int m,int[][]dp){
        if(i==n-1 && j==m-1) return 1;
        if(dp[i][j] !=-1) return dp[i][j];
        if(i<0 || i>=n || j<0 || j>=m) return 0;
        return dp[i][j]= func(i+1,j,n,m,dp)+func(i,j+1,n,m,dp);
    }
    public int uniquePaths(int m, int n) {
       int [][] dp = new int[n+1][m+1];
       for(int[] row:dp){
        Arrays.fill(row,-1);
       }
       return func(0,0,n,m,dp); 
    }
}