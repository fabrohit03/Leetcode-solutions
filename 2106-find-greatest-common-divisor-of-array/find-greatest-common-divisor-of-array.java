class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            small = Math.min(small,nums[i]);
            big = Math.max(big,nums[i]);
        }
        while(big%small!=0){
            int rem = big%small;
            big = small;
            small = rem;
        }
        return small;
    }
}