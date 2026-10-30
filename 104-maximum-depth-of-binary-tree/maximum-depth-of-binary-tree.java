class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        int res = 1+Math.max(l,r);
        return res;
    }
}