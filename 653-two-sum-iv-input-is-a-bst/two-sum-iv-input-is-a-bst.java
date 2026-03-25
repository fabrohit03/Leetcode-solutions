class Solution {
    List<Integer> twoSum = new ArrayList<>();
    private void func(TreeNode root){
        if(root==null) return;
        func(root.left);
        twoSum.add(root.val);
        func(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        func(root);
        int i =0;
        int j = twoSum.size()-1;
        while(i<j){
            long sum = twoSum.get(i)+twoSum.get(j);
            if(sum==k) return true;
            else if(sum<k) {
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}