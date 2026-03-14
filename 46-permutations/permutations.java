class Solution {

    void func(int [] nums ,boolean [] used, int n ,List<List<Integer>>res , List<Integer>temp){
        if(n==temp.size()){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<n;i++){
            if(used[i]) continue;
            used[i]=true;
            temp.add(nums[i]);
            func(nums,used,n,res,temp);
            temp.remove(temp.size()-1);
            used[i]=false;

        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = nums.length;
        boolean [] used = new boolean[nums.length];
        func(nums,used,n,res,temp);
        return res;
    }
}