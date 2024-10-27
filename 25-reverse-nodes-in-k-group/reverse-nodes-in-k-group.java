/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // adding base condition
        if (k == 1 || head == null)
            return head;
        int count = 0;
        ListNode current = head;
        //
        while(current != null && count < k){
            count++;
            current = current.next;
        }
        //where we got to know to reverse K elements in group
        if(count == k){
            ListNode ptr1 = null, ptr2 = null;
            current = head;
            for(int i = 0; i<k; i++){
                ptr1 = current.next;
                current.next = ptr2;
                ptr2 = current;
                current = ptr1;
            }
            head.next = reverseKGroup(ptr1,k);
            return ptr2;
        } else {
            return head;
        }
    }
}