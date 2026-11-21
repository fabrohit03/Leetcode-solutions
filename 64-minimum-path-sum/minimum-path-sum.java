class Solution {
    int func(int i, int j, int[][]a,int n, int m,int[][]dp){
        if(i==0 && j==0) return a[0][0];
        if(dp[i][j] !=-1) return dp[i][j];
        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if (i > 0){
        up = a[i][j]+func(i-1,j,a,n,m,dp);
        }
        if (j > 0){
        left = a[i][j]+func(i,j-1,a,n,m,dp);
        }
        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int n =grid.length;
        int m =grid[0].length;
        int [][]dp = new int[n][m];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(n-1,m-1,grid,n,m,dp);
    }
}