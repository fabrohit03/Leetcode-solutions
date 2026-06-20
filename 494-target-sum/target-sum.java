class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum =0;
        for(int num:nums){
            sum += num;
        }
        if(Math.abs(target)>sum) return 0;
        if((target+sum)%2!=0) return 0;
        int totalSum = (target+sum)/2;
        int dp[][] = new int [n+1][totalSum+1];
        dp[n][0]=1;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=totalSum; j++){
                int notTake = dp[i+1][j];
                int take = 0;
                if(j>=nums[i]){
                    take = dp[i+1][j-nums[i]];
                }
                dp[i][j]=take+notTake;
            }
        }
       return dp[0][totalSum];
    }
}