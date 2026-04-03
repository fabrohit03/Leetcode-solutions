class Solution {
    TreeNode prev = null;
    boolean ans = true;
    private void isValidate(TreeNode root){
        if(root==null) return;
        isValidate(root.left);
        if(prev==null) prev = root;
        else{
            if(root.val<=prev.val){
                ans=false;
            }
            prev =  root;
        }
        isValidate(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        isValidate(root);
        return ans;
    }
}