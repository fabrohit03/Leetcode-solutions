class Solution {
    public void sortColors(int[] nums) {
       int idx =0;
       int zero =0;
       int one = 0;
       int two =0;
       for(int i=0; i<nums.length; i++){
        if(nums[i]==0) zero+=1;
        else if(nums[i]==1) one+=1;
        else two+=1;
       } 
       for(int i=0; i<zero; i++){
        nums[idx++]=0;
       }
       for(int i=0; i<one; i++){
        nums[idx++]=1;
       }
       for(int i=0; i<two; i++){
        nums[idx++]=2;
       }
    }
}