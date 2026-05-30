class Solution {
    int [][] dp;
    private int func(int[] nums,int n, int i , int free){
        if(i>=n) return 0;
        if (dp[i][free]!=-1) return dp[i] [free];
        if(free == 0) return dp[i][free] = func(nums,n,i+1,1);
        int rob = nums[i]+func(nums,n,i+1,0);
        int skip = func(nums,n,i+1,1);
        return dp[i][free] = Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n][2];
        for(int i = 0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return func(nums,n,0,1);
    }
}