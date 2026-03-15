
class Solution {
    void func(TreeNode root, List<Integer> res){
        if(root ==null) return ;
        func(root.left,res);
        res.add(root.val);
        func(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> res = new ArrayList<>();
        func(root,res);
        return res;
    }
}