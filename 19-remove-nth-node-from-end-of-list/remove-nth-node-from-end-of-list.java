class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;

        }
        if(count==n){
           ListNode newHead = head.next;
            return newHead;
        }
        int res = count-n;
        temp=head;
        while(res>1){
            temp=temp.next;
            res--;
        }
        temp.next=temp.next.next;
        return head;
    }
}