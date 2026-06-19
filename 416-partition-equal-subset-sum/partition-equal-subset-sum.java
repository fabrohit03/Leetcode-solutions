class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0; i<n;i++){
            sum = sum+nums[i];
        }
         if(sum%2==1) return false;
        Boolean dp[][] = new Boolean [n+1][sum/2+1];
        dp[n][0] = true;
        for(int j =1; j<=sum/2; j++){
            dp[n][j]= false;
        }
        for(int i=n-1; i>=0;i--){
            for(int j=0; j<=sum/2; j++){
                if(nums[i]>j){
                    dp[i][j] = dp[i+1][j];
                }else{
                    dp[i][j]= dp[i+1][j-nums[i]] || dp[i+1][j];
                }
            }
        }
        return dp[0][sum/2];
    }
}