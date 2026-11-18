class Solution {
    long f(int idx,int t, int [] a,long[][]dp){
        if(idx==0){
            return (t%a[0]==0) ? 1:0;
        }
         if(dp[idx][t] != -1) {
            return dp[idx][t];
        }
        long notTake=f(idx-1,t,a,dp);
        long take=0;
        if(a[idx]<=t) {take=f(idx,t-a[idx],a,dp);}
        return dp[idx][t]= take+notTake;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        long[][] dp = new long[n][amount+1];
        for(long[] row:dp){
            Arrays.fill(row,-1);
        }
        return (int) f(n-1,amount,coins,dp);
    }
}