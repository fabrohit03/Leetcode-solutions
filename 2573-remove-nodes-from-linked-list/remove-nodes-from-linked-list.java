class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
    head = reverse(head);
    int maxSoFar = Integer.MIN_VALUE;
    ListNode curr = head;
    ListNode prev = null;
    while(curr!=null){
        if(curr.val>=maxSoFar){
            maxSoFar = curr.val;
            prev = curr;
        }else{
            prev.next =curr.next;
            
        }
        curr = curr.next;
    
    }
    return reverse(head);
    }
}