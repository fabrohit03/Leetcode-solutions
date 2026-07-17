class Solution {
    public int maxSubArray(int[] nums) {
        int i= 1;
        int be = nums[0];
        int res = be;
        while(i<nums.length){
            int p = be+nums[i];
            if(p<nums[i]){
                be=nums[i];
                if(be>res){
                    res=be;
                }
            }else{
                be=p;
                if(be>res){
                    res=be;
                }
            }
            i++;
        }
        return res;
    }
}