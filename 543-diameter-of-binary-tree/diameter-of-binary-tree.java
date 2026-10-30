class Solution {
    int res = 0;
    int func(TreeNode root){
        
        if(root==null) return 0;
        int l = func(root.left);
        int r = func(root.right);
        int sum= l+r;
        res = Math.max(res,sum);
        return 1+Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        func(root);
        return res;
    }
}