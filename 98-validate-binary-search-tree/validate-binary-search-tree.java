class Solution {
    boolean ans = true;
    TreeNode prev = null;
    void func(TreeNode root){
        if(root==null) return;
        func(root.left);
        if(prev==null) prev=root;
        else{
            if(root.val<=prev.val){
                ans=false;
            }
            prev=root;
        }
        func(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        func(root);
        return ans;
    }
}