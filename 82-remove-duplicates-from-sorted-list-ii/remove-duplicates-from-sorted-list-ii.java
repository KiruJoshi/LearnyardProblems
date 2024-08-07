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
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null || head.next == null)
        return head;

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode current = head;

    while (current != null) {
        boolean isDuplicate = false;

        // Find if current node is a duplicate
        while (current.next != null && current.val == current.next.val) {
            isDuplicate = true;
            current = current.next;
        }

        // If current node is a duplicate, remove all occurrences
        if (isDuplicate) {
            prev.next = current.next;
        } else {
            prev = prev.next;
        }

        current = current.next;
    }

    return dummy.next;
}
}