class Solution {
    public int findMin(int[] nums) {
        int small = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(small>nums[i]){
                small=nums[i];
            }
        }
        return small;
    }
}