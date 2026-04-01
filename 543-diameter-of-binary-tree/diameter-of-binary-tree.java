class Solution {
    int res=0;
    private int func(TreeNode root){
        if(root==null) return 0;
        int left = func(root.left);
        int right = func(root.right);
        int sum = left+right;
        res = Math.max(res,sum);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        func(root);
        return res;
    }
}