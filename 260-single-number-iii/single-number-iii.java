class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num)==1){
                res.add(num);
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}