/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode head1, ListNode head2) {
        ListNode dummy  = new ListNode(-1);
        ListNode temp = dummy;

        while(head1 != null && head2 != null) {
            if(head1.val >= head2.val) {
                temp.next = head2;
                head2 = head2.next;
            } else {
                temp.next = head1;
                head1 = head1.next;
            }
            temp = temp.next;
        }

        if(head1 != null ) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }
        return dummy.next;
    }
    

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null ) {
            return head;
        }
        ListNode mid = findMiddle(head);
        ListNode rightHead = mid.next; // connect first
        mid.next = null; // then disconnect

        ListNode left = sortList(head);  
        ListNode right = sortList(rightHead); 
        return mergeList(left,right); 
    }

}