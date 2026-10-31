class Solution {
    int res  = 0;
    int count = 0;
    void func(TreeNode root, int k){
        if (root==null) return;
        func(root.left,k);
        count++;
        if(count==k){
            res = root.val;
            return;
        }
        func(root.right,k);
        
    }
    public int kthSmallest(TreeNode root, int k) {
       func(root,k);
        return res;
    }
}