/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void func(TreeNode root, List<Integer>res){
        if(root==null){
            return;
        }
        func(root.left,res);
        res.add(root.val);
        func(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res = new ArrayList<>();
        func(root,res);
        return res;
    }
}