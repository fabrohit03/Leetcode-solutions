class Solution {
    private boolean isMirror(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        boolean r1 = isMirror(root1.left,root2.right);
        boolean r2 = isMirror(root1.right,root2.left);
        return r1 && r2;
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
}