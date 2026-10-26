class Solution {
    void func(int[] nums, List<List<Integer>>res, List<Integer>temp, int n, int i){
        if(n==i){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        func(nums,res,temp,n,i+1);
        temp.remove(temp.size()-1);
        func(nums,res,temp,n,i+1);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        int n = nums.length;
        func(nums,res,temp,n,0);
        return res;
    }
}