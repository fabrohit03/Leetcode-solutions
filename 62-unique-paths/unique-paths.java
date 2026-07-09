class Solution {
    public int uniquePaths(int m, int n) {
        int [] [] dp = new int [n+1][m+1];
        for(int i=0; i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,m,n,dp);
    }
    private int func(int i, int j, int m , int n,int[][]dp){
        if(i==n-1 && j==m-1) return 1;
        
        if(i<0 || i>=n || j<0 || j>=m) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j] = func(i+1,j,m,n,dp)+func(i,j+1,m,n,dp);
    }
}