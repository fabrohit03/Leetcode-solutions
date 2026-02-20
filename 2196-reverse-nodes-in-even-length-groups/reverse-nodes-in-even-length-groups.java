class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        ListNode prev=dummy;

        int groupsize =1;
        while(curr!=null){
            ListNode temp = curr;
            int count =0;
            while(temp!=null && count<groupsize){
                temp=temp.next;
                count++;
            }

            if(count%2==0){
                ListNode node=curr;
                ListNode prevNode = null;
                for(int i=0;i<count;i++){
                    ListNode next=node.next;
                    node.next=prevNode;
                    prevNode=node;
                    node =next;
                }

                prev.next=prevNode;
                curr.next=node;

                prev=curr;
                curr=node;

            }
            else{
                for(int i=0;i<count;i++){
                    prev=curr;
                    curr=curr.next;
                }
            }
            groupsize++;
        }
        return dummy.next;
    }
}