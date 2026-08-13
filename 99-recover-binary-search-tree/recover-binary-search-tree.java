class Solution {
    TreeNode galat1_first = null;
    TreeNode galat1_second = null;
    TreeNode galat2_first = null;
    TreeNode galat2_second = null;
    TreeNode prev = null;
    int galat = 0;
    
    void func(TreeNode root){
        if(root==null) return;
        func(root.left);
        if(prev != null && root.val <=prev.val){
            if(galat == 0){
                galat1_first = prev;
                galat1_second = root;
                galat++;
            }
            else{
                galat2_first = prev;
                galat2_second = root;
                galat++;
            }
        }
        prev = root;
        func(root.right);
    }
    public void recoverTree(TreeNode root) {
        func(root);
        if(galat == 1){
            int temp = galat1_first.val;
            galat1_first.val = galat1_second.val;
            galat1_second.val = temp;
        }else{
            int temp = galat1_first.val;
            galat1_first.val = galat2_second.val;
            galat2_second.val = temp;
        }
    }
}