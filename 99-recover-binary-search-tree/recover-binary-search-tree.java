class Solution {
    TreeNode galat1_first=null;
    TreeNode galat1_sec=null;
    TreeNode galat2_first=null;
    TreeNode galat2_sec=null;
    int galat=0;
    TreeNode prev = null;
    private void func(TreeNode root){
        if(root==null) return;
        func(root.left);
            if(prev!=null && root.val<prev.val){
                {
                    if(galat==0){
                        galat1_first=prev;
                        galat1_sec=root;
                        galat++;
                    }else{
                        galat2_first=prev;
                        galat2_sec=root;
                        galat++;
                    }
                   
                }
            }
            prev=root;
            func(root.right);
    }

    public void recoverTree(TreeNode root) {
        func(root);

        if(galat==1){
            int temp = galat1_first.val;
            galat1_first.val=galat1_sec.val;
            galat1_sec.val=temp;
        }else{
            int temp = galat1_first.val;
            galat1_first.val=galat2_sec.val;
            galat2_sec.val=temp;
        }
    }
}