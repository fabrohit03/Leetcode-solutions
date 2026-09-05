class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        if(sum%2==1) return false;
        boolean [][] dp = new boolean[n+1][sum/2+1];
        dp[n][0]=true;
        for(int i=nums.length-1; i>=0; i--){
            for(int j=0; j<=sum/2; j++){
                if(nums[i]>j){
                    dp[i][j]=dp[i+1][j];
                }else{
                    dp[i][j]=dp[i+1][j-nums[i]] || dp[i+1][j];
                }
            }
        }
        return dp[0][sum/2];
    }
}