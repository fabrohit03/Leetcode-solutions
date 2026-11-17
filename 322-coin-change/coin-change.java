class Solution {
    int f(int idx, int t, int[]nums,int[][] dp){
        if(idx==0){
            if(t%nums[0]==0) return t/nums[0];
            return (int) 1e9;
        }
        if(dp[idx][t] !=-1) return dp[idx][t];
        int notTake = 0+f(idx-1,t,nums,dp);
        int take = (int) 1e9;
        if(nums[idx]<=t){
            take = 1+f(idx,t-nums[idx],nums,dp);
        }
        return dp[idx][t]=Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = f(n-1,amount,coins,dp);
        if(ans>=(int) 1e9) return -1;
        return ans;
    }
}