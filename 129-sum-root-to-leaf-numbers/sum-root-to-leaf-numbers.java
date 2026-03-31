class Solution {
    int res = 0;
    private void func(TreeNode root,int sum){
        if(root==null) return ;
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            res+=sum;
            return;
        }
        func(root.left,sum);
        func(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        func(root,0);
        return res;
    }
}