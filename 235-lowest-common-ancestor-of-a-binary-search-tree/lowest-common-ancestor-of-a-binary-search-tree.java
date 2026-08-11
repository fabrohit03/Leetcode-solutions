class Solution {
    TreeNode ans = null;
    void func(TreeNode root, TreeNode p , TreeNode q){
        if(root==null) return;
        if(p.val>root.val && q.val>root.val) func(root.right,p,q);
        else if(p.val<root.val && q.val<root.val) func(root.left,p,q);
        else{
            ans = root;
            return;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        func(root,p,q);
        return ans;
    }
}