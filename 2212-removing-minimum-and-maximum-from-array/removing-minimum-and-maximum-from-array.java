class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minI = -1;
        int maxI = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
                minI = i;
            }
             if(nums[i]>max){
                max = nums[i];
                maxI = i;
            }
           
        }
        int left = Math.min(minI,maxI);
        int right = Math.max(minI,maxI);
        int n = nums.length;
        int delLeft = right+1;
        int delRig = n-left;
        int delBoth = left+1+n-right;
        return Math.min(delLeft,Math.min( delRig,delBoth));
    }
}