class Solution {
    int res = 0;
    int sum(TreeNode root){
        if(root==null) return 0;
        int ls = sum(root.left);
        int rs = sum(root.right);
        res += Math.abs(ls-rs);
        return ls+rs+root.val;
    }
    public int findTilt(TreeNode root) {
        sum(root);
        return res;
    }
}