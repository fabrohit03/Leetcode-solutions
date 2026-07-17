class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxE = 0;
        int minE = 0;
        int maxS = 0;
        int minS = 0;
        for(int i=0; i<nums.length; i++){
            maxE = Math.max(nums[i]+maxE,nums[i]);
            minE = Math.min(nums[i]+minE,nums[i]);
            maxS = Math.max(maxE,maxS);
            minS = Math.min(minE,minS);
        }
        return Math.max(maxS,Math.abs(minS));
    }
}