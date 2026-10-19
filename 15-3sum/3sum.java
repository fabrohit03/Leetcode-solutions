class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>>res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i <nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            int sum = -nums[i];
            while(j<k){
                int curr = nums[j]+nums[k];
                if(curr==sum){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                
                while(j<k && nums[j]==nums[j+1]) j++;
                while(j<k && nums[k]==nums[k-1]) k--;
                j++;
                k--;
            }else if(curr<sum) j++;
            else k--;
            }
        }
        return res;
    }
}