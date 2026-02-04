class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int [] res= new int [n];
        int ind =0;
        k=k%n;
        int i=0;
        int j=n-k;
        while(j<n){
            res[ind++]=nums[j++];
        }
        while(i<n-k){
            res[ind++]=nums[i++];
        }
        for(int x=0;x<n;x++){
            nums[x]=res[x];
        }
    }
}