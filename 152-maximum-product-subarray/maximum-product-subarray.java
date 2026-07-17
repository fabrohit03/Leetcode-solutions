class Solution {
    public int maxProduct(int[] nums) {
       int i = 1;
       int maxEnd = nums[0];
       int minEnd = nums[0];
       int res = nums[0];
       while(i<nums.length){
        int v1 = nums[i];
        int v2 = maxEnd*nums[i];
        int v3 = minEnd*nums[i];
        maxEnd = Math.max(v1,Math.max(v2,v3));
        minEnd = Math.min(v1,Math.min(v2,v3));
        res = Math.max(res,Math.max(maxEnd,minEnd));
        i++;
       } 
       return res;
    }
}