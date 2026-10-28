class Solution {
    void func(int [] arr, List<List<Integer>>res, List<Integer>temp, int target,int idx){
        
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(idx==arr.length || target<0){
            return;
        }
        temp.add(arr[idx]);
        func(arr,res,temp,target-arr[idx],idx);
        
        temp.remove(temp.size()-1);
        func(arr,res,temp,target,idx+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        func(candidates,res,temp,target,0);
        return res;
    }
}