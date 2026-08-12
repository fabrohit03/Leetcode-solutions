class Solution {
    boolean ans = true;
    int func(TreeNode root){
        if(root==null) return 0;
        int l = func(root.left);
        int r = func(root.right);
        if(Math.abs(l-r)>1) ans = false;
        return 1+Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        func(root);
        return ans;
    }
}