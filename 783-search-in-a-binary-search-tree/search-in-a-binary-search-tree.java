class Solution {
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val){
            ans = root;
            return ans;
        }
        if(root.val<val) searchBST(root.right,val);
        else
        searchBST(root.left,val);
        return ans;
    }
}