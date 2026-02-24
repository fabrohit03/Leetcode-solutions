class Solution {
    private boolean func(int [] nums,int k,int n,int limit){
        int a = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum+nums[i]<=limit) sum+=nums[i];
            else{
                a++;
                sum = nums[i];
                if(a>k) return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        int res = 0;
        for(int num:nums){
            low = Math.max(low,num);
            high += num;
        }
        while(low<=high){
            int limit = low+(high-low)/2;
            if(func(nums,k,n,limit)==true){
                res = limit;
                high = limit-1;
            }
            else{
                low = limit+1;
            }
        }
        return res;
    }
}