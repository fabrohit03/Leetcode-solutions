class Solution {
    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        int[]cut =new int[c+2];
         cut[0]=0;
         cut[c+1]=n;
         int[][]dp = new int[c+2][c+2];
         for(int i=0; i<c; i++){
            cut[i+1]=cuts[i];
         }
         Arrays.sort(cut);
        for(int i=c; i>=1; i--){
            for(int j=1; j<=c; j++){
            if(i>j) continue;
             int min = Integer.MAX_VALUE;
        for(int idx=i; idx<=j; idx++){
            int cost = cut[j+1]-cut[i-1]+dp[i][idx-1]+dp[idx+1][j];
            min = Math.min(min,cost);
         }
          dp[i][j]= min;
        }
           
        }
        
    return dp[1][c];
    }
}