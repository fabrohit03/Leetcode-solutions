class Solution {
    int bs(ArrayList<Integer>res,int num){
        int l=0;
        int r =res.size()-1;
        while(l<r){
            int mid = (l+r)/2;
            if(res.get(mid)==num){
                return mid;
            }
            if(res.get(mid)<num){
                l=mid+1;
            }else{
                r=mid;

            }
           
        }
         return l;
    }
    public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    ArrayList<Integer> res = new ArrayList<>();
    res.add(nums[0]);
    for(int i=1; i<n; i++){
        if(nums[i]>res.get(res.size()-1)){
            res.add(nums[i]);
        }
        else{
            int j = bs(res,nums[i]);
            res.set(j,nums[i]);
            
        }
    }
    return res.size();
    }
}