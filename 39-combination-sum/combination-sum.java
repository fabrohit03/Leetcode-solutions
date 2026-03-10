class Solution {

    void func(int [] candidates,int n,int sum , int index,int target , List<List<Integer>>res,List<Integer>diary){
        if(index==n){
            if(target==sum)
            res.add(new ArrayList<>(diary));
            return;
        }

        func(candidates,n,sum,index+1,target,res,diary);
        if(candidates[index]+sum<=target){
            diary.add(candidates[index]);
            sum=candidates[index]+sum;
            func(candidates,n,sum,index,target,res,diary);
            diary.remove(diary.size()-1);
        }
    return ;
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        int n = candidates.length;
        func(candidates,n,0,0,target,res,diary);
        return res;
    }
}