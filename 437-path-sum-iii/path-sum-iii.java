class Solution {
    int count = 0;
    private void func(TreeNode root,long currentSum,int targetSum){
        if(root==null) return;
        currentSum+=root.val;
        if(currentSum==targetSum) count++;
        func(root.left,currentSum,targetSum);
        func(root.right,currentSum,targetSum);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        func(root,0,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }
}