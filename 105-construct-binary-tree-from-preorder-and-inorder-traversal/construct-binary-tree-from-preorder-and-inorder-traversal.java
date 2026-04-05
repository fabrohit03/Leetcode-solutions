class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int idx=0;
    private TreeNode func(int [] preorder, int low ,int high){
        if (low>high) return null;
        TreeNode node = new TreeNode(preorder[idx]);
        idx++;
        int id=map.get(node.val);
        node.left=func(preorder,low,id-1);
        node.right = func(preorder,id+1,high);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0; i<inorder.length;i++){
        map.put(inorder[i],i);
    }
        return func(preorder,0,inorder.length-1);
    }
}