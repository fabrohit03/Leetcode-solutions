class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxE = nums[0];
        int minE = nums[0];
        int maxSum = nums[0];
        int minSum = nums[0];
        for(int i=0; i<nums.length; i++){
            totalSum+=nums[i];
        }
        for(int i=1; i<nums.length; i++){
            maxE = Math.max(nums[i]+maxE, nums[i]);
            minE = Math.min(nums[i]+minE, nums[i]);
            maxSum = Math.max(maxE,maxSum);
            minSum = Math.min(minE,minSum);
            
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum,totalSum-minSum);
    }
}