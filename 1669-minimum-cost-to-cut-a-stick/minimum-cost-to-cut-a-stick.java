class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer>cut = new ArrayList<>();
        cut.add(0);
        for(int x : cuts){
            cut.add(x);
        }
        cut.add(n);
        Collections.sort(cut);
        int[] arr = new int[cut.size()];
        for(int i=0; i<cut.size(); i++){
            arr[i] = cut.get(i);
        }
        int m = cuts.length;
        int [][] dp = new int[m+2][m+2];
        for(int[] rows: dp){
            Arrays.fill(rows,-1);
        }
        return func(arr,1,m,dp);
    }
    private int func(int[] cuts, int i, int j, int[][] dp){
        if(i>j) return 0;
        if(dp[i][j] !=-1) return dp[i][j];
        int res = Integer.MAX_VALUE;
        for(int k=i; k<=j; k++){
            int cost = cuts[j+1]-cuts[i-1];
            int r = cost+func(cuts,i,k-1,dp)+func(cuts,k+1,j,dp);
            res = Math.min(res,r);
        }
        return dp[i][j]= res;
    }
}