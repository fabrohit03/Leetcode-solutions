class Solution {
    int ans;
    void func(TreeNode root, int k,List<Integer>res){
        if (root==null) return;
        func(root.left,k,res);
        res.add(root.val);
        func(root.right,k,res);
        for(int i=0; i<res.size(); i++){
            if(i==k-1){
                ans = res.get(i);
            break;
            }
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>res = new ArrayList<>();
       func(root,k,res);
        return ans;
    }
}