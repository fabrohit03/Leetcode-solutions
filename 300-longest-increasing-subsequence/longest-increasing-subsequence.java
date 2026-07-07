class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer>res = new ArrayList<>();
        res.add(nums[0]);
        for(int i =1; i<nums.length; i++){
            if(nums[i]>res.get(res.size()-1)){
                res.add(nums[i]);
            }else{
                int j = binarySearch(res,nums[i]);
                res.set(j,nums[i]);
            }
        }
        return res.size();
    }

private int binarySearch(ArrayList<Integer>res, int num){
    int left =0;
    int right = res.size()-1;

    while(left<right){
        int mid = (left+right)/2;
        if(res.get(mid)==num){
            return mid;
        }
        if(res.get(mid)<num){
            left = mid+1;
        }else{
            right = mid;
        }

    }
    return left;
}
}

