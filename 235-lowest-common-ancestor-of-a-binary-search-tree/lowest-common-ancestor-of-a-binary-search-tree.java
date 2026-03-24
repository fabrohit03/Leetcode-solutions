class Solution {
    TreeNode ans = null;
    private void func(TreeNode root , TreeNode p, TreeNode q){
        if(root==null) {
            return;
        }
        if(root.val<p.val && q.val>root.val) func(root.right,p,q);
        else if (root.val>p.val && root.val>q.val) func(root.left,p,q);
        else{
            ans=root;
            return ;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        func(root,p,q);
        return ans;
    }
}