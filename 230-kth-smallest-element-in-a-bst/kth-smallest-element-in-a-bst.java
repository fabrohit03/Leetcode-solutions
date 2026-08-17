class Solution {
    void inorder(TreeNode root, List<Integer>res){
        if(root==null) return ;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res.get(k-1);
    }
}