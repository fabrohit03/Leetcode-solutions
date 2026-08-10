class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        List<List<Integer>>res = new ArrayList<>();
        if(root==null) return res;
        while(!q.isEmpty()){
            int lvlSize = q.size();
            List<Integer>temp = new ArrayList<>();
            while(lvlSize-- >0){
            TreeNode t = q.peek();
            q.poll();
            temp.add(t.val);
            if(t.left!=null) q.add(t.left);
            if(t.right!=null) q.add(t.right);
            }
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}