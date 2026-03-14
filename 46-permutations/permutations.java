class Solution {

    void func(int index,int [] nums ,List<List<Integer>>res ){
        if(index==nums.length){
            List <Integer> temp = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }
        res.add(new ArrayList<>(temp));
        return ;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            func(index+1,nums,res);
            swap(i,index,nums);
        }
        }
        

    private void swap(int i, int j, int [] nums){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        func(0,nums,res);
        return res;
    }
}