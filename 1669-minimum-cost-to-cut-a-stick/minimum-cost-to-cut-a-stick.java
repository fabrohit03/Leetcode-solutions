class Solution {
    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        int[]cut =new int[c+2];
         cut[0]=0;
         cut[c+1]=n;
         int[][]dp = new int[c+2][c+2];
         for(int[]row:dp){
            Arrays.fill(row,-1);
         }
         for(int i=0; i<c; i++){
            cut[i+1]=cuts[i];
         }
         Arrays.sort(cut);
       return func(1,c,cut,dp);
    }
   int func(int i,int j, int[]cuts,int[][]dp){
    if(i>j) return 0;
    int min = Integer.MAX_VALUE;
    if(dp[i][j]!=-1) return dp[i][j];
    for(int idx=i; idx<=j; idx++){
        int cost = cuts[j+1]-cuts[i-1]+func(i,idx-1,cuts,dp)+func(idx+1,j,cuts,dp);
        min = Math.min(min,cost);
    }
    return dp[i][j]= min;
   }
}