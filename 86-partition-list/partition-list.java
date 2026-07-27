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
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(-1);
        ListNode largeDummy = new ListNode(-1);

        ListNode Small = smallDummy;
        ListNode Large = largeDummy;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val >= x) {
                Large.next = temp;
                Large = Large.next;
            } else {
                Small.next = temp;
                Small = Small.next;
            }
            temp = temp.next;
        }
        Large.next = null;
        Small.next = largeDummy.next;
        return smallDummy.next;
    }
}