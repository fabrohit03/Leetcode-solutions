class Solution {
    private boolean isComplete(TreeNode root){
        if(root==null) return true;
        boolean isFound = false;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t = q.peek();
            q.remove();
            if(t==null) isFound = true;
            else{
                if(isFound){
                    return false;
                }
            q.add(t.left);
            q.add(t.right);
            }
            
        }
        return true;
    }
    public boolean isCompleteTree(TreeNode root) {
        return isComplete(root);
    }
}