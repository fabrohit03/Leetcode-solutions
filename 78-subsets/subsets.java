class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        int n = 1<<nums.length;
        
        for(int mask=0; mask<n; mask++){
            List<Integer>res = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                if((mask & (1<<i)) !=0){
                    res.add(nums[i]);
                }
            }
            ans.add(res);
        }
        return ans;
    }
}