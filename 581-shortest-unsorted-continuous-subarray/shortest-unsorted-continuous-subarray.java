class Solution {
    public int findUnsortedSubarray(int[] nums) {
     int n = nums.length;
     int left = -1 ,right = -1;
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     for(int i=n-1;i>=0;i--){
        if(nums[i]>min){
            left =i;
        }
        else{
            min=nums[i];
        }
     }
     for(int j=0;j<n;j++){
        if(nums[j]<max){
            right=j;
        }else{
            max=nums[j];
        }
     }
     return (left==-1) ? 0 : right-left+1;
    }
}