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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode ptr = dummy, temp = null;
        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                ptr.next = new ListNode(current1.val);
                ptr = ptr.next;
                current1 = current1.next;
            } else {
                ptr.next = new ListNode(current2.val);
                ptr = ptr.next;
                current2 = current2.next;
            }
        }
        while (current1 != null) {
            ptr.next = new ListNode(current1.val);
            ptr = ptr.next;
            current1 = current1.next;
        }
        while (current2 != null) {
            ptr.next = new ListNode(current2.val);
            ptr = ptr.next;
            current2 = current2.next;
        }
        return dummy.next;
    }
}