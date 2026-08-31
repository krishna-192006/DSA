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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }

        int arr[] = new int[size];
        int i=0;
        temp = head;
        while(temp != null) {
            arr[i] = temp.val;
            temp = temp.next; 
            i++;
        }
        int critical[] = new int[size];
        int k = 0;
        for(int m=1;m<size-1;m++) {
            if(arr[m] > arr[m-1] && arr[m] > arr[m+1] || arr[m] < arr[m-1] && arr[m] < arr[m+1]) {
               critical[k] = m;
               k++;
            }   
        }
        if(k < 2) {
            return new int[]{-1,-1};
        }
        int min = Integer.MAX_VALUE;
        for(int p=1;p<k;p++) {
            min = Math.min(min,critical[p] - critical[p-1]);
        }
        int max = critical[k-1] - critical[0];

        return new int[] {min,max};
    }
}