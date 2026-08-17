class Solution {
    int res = 0;
    int c = 0;
    void inorder(TreeNode root, int k){
        if(root==null) return ;
        inorder(root.left, k);
        c++;
        if(c==k){
            res=root.val;
            return;
        }
        inorder(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return res;
    }
}