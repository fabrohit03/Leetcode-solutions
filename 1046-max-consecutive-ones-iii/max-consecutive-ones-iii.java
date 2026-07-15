class Solution {
    public int longestOnes(int[] nums, int k) {
        int low =0;
        int zero =0;
        int res=0;
        for(int high=0; high<nums.length; high++){
            if(nums[high]==0) zero++;
            while(zero>k){
                if(nums[low]==0){
                    zero--;
                }
                low++;
            }
            res = Math.max(res,high-low+1);
        }
        return res;
    }
}