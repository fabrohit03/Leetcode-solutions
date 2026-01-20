class Solution {

    ListNode reverse(ListNode head, int k){
        ListNode curr = head;
        ListNode prev=null;
        while(k-- >0){
            ListNode next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }return prev;
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode left= head;
        ListNode right;
        ListNode prevLeft =null;
        ListNode res=null;
        while(true){
            right=left;
            boolean valid =true;
        for(int i=0;i<(k-1);i++){
            if(right==null)
              {
                valid=false;
                break; 
                }
            right=right.next;

        }
        if(!valid || right == null) break;

    
        ListNode nextLeft = right.next;
        ListNode newHead = reverse(left,k);
        if(prevLeft!=null){
            prevLeft.next=newHead;
        }
        prevLeft=left;
        if(res==null) res=newHead;
        left.next=nextLeft;
        left=nextLeft;
       
    
    }

    return res!=null ? res : head;
}
}