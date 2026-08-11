class Solution {
    List<Integer>temp = new ArrayList<>();

    void func(TreeNode root){
        if(root==null){
            return;
        }
        func(root.left);
        temp.add(root.val);
        func(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        func(root);
        int i =0;
        int j = temp.size()-1;
        while(i<j){
            int sum = temp.get(i)+temp.get(j);
            if(sum==k) return true;
            if (sum<k) i++;
            else j--;
        }
        return false;
    }
}