class Solution {
    boolean res = false;
    void func(TreeNode root , int sum , int targetSum){
        if(root==null) return;
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum) res=true;
        }
        func(root.left,sum,targetSum);
        func(root.right,sum,targetSum);
        return;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        func(root,0,targetSum);
        return res;
    }
}