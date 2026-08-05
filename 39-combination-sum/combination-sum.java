class Solution {
    void func(int[] candidates, int n, int sum, int target, int index, List<List<Integer>>res, List<Integer>diary){
        if(index==n){
            if(target==sum)
                res.add(new ArrayList<>(diary));
            return;
        }
        func(candidates, n, sum, target, index+1, res,diary);
        if(sum+candidates[index]<=target){
            diary.add(candidates[index]);
            sum +=candidates[index];
            func(candidates, n,sum, target, index,res, diary);
            diary.remove(diary.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>diary = new ArrayList<>();
        int n = candidates.length;
        func(candidates,n,0,target,0,res,diary);
        return res;
    }
}