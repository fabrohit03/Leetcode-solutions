class Solution {
    int func(int[]nums, int n,int prev,int i,int[][]dp){
        
        if(i==n) return 0;
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        int notTake =func(nums,n,prev,i+1,dp);
        int take =0;
        if(prev==-1 || nums[i]>nums[prev]){
            take = 1+func(nums,n,i,i+1,dp);
        }
        return dp[i][prev+1]=Math.max(take,notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int prev = -1;
        int[][]dp = new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return func(nums,n,prev,0,dp);
    }
}