class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>arr = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1!=null){
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2!=null){
            arr.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(arr);
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for(int val : arr){
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return head.next;
    }
}