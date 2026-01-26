class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zero=0;
        int one=0;
        int two=0;
        int ind=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                zero+=1;
            }
            else if(nums[i]==1){
                one+=1;
            }
            else{
                two+=1;
            }
        }
        for(int i=0;i<zero;i++){
            nums[ind++]=0;
        }
        for(int i=0;i<one;i++){
            nums[ind++]=1;
        }
        for(int i=0;i<two;i++){
            nums[ind++]=2;
        }
        

    }
}