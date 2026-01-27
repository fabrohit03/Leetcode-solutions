class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int low=0;
        int high=0;
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        while(high<n){
            sum=sum+nums[high];
            while(sum>=target){
               int length=high-low+1;
                res=Math.min(res,length);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}