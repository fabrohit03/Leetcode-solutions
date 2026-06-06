class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       Stack<TreeNode>st1 = new Stack<>();
       Stack<TreeNode>st2 = new Stack<>();
       st1.push(root1);
       st2.push(root2);
       while(!st1.isEmpty() && !st2.isEmpty()){
        int l1 = dfs(st1);
        int l2 = dfs(st2);
        if(l1!=l2) return false;
        
       }
       return st1.isEmpty() && st2.isEmpty();
    }
    private int dfs(Stack<TreeNode>stack){
        while(true){
       TreeNode node = stack.pop();
       if(node.left!=null) stack.push(node.left);
       if(node.right!=null) stack.push(node.right);
       if(node.left==null && node.right==null) return node.val;
    }
    }
}