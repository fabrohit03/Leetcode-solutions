class Solution {
    private int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null) return null;

        int lh = height(root.left);
        int rh = height(root.right);

        if(lh==rh) return root;
        if(lh>rh) return lcaDeepestLeaves(root.left);
        else return lcaDeepestLeaves(root.right);
    }
}