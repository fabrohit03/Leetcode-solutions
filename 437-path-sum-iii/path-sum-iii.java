class Solution {
    int count = 0;
    private void func(TreeNode root,long currSum,int targetSum,HashMap<Long,Integer> map){
        if(root==null) return;
        currSum+=root.val;
        if(map.containsKey(currSum-targetSum))
        count+=map.get(currSum-targetSum);
        map.put(currSum,map.getOrDefault(currSum,0)+1);
        func(root.left,currSum,targetSum,map);
        func(root.right,currSum,targetSum,map);
        map.put(currSum,map.get(currSum)-1);
        return;
    }
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long,Integer> map = new HashMap<>();
        if(root==null) return 0;
        map.put(0L,1);
        func(root,0,targetSum,map);
        return count;
    }
}