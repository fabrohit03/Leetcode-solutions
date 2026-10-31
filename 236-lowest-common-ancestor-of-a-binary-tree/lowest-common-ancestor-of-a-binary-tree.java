class Solution {
    TreeNode ans = null;
    int func(TreeNode root,TreeNode p, TreeNode q){
        if(root==null) return 0;
        int left = func(root.left,p,q);
        int right = func(root.right,p,q);
        int self = 0;
        if(root==p || root==q){
            self++;
        }
        int total = left+right+self;
        if(total==2 && ans ==null){
            ans = root;
        }
        return total;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        func(root,p,q);
        return ans;
    }
}