class Solution {
    public int maxSubArray(int[] nums) {
        int be = nums[0];
        int res = be;
        for(int i=1; i<nums.length; i++){
            int sum = be+nums[i];
            if(sum<nums[i]){
                be = nums[i];
                if(be>res){
                    res = be;
                }
            }else{
                be = sum;
                if(be>res){
                    res = be;
                }
            }
        }
        return res;
    }
}