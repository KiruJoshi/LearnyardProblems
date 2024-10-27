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
    public void reorderList(ListNode head) {
        // find the mid of linkedlist
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second_list = slow.next;
        // breaking the list from middle
        slow.next = null;
        ListNode current = second_list;
        ListNode prev = null, temp = null;
        while (current != null) {// reverse the middle 2nd list
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        ListNode newHead = prev;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        current = head;
        ListNode current1 = head, current2 = newHead;

        while (current2 != null) {
            ListNode ptr1 = current1.next;
            ListNode ptr2 = current2.next;
            current1.next = current2;
            current2.next = ptr1;
            current1 = ptr1;
            current2 = ptr2;
        }

    }
}