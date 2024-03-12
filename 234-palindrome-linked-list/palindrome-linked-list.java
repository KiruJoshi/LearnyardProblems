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
    public boolean isPalindrome(ListNode head) {
        ListNode h1 = head;
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;

        ListNode rh = null;//
        ListNode t = temp;// temp=1
        while (temp != null) {
            temp = temp.next;// head=2,3
            t.next = rh;// t.next=null;,1
            rh = t;// rh=2,1
            t = temp;// t=2,
        }
        while (h1 != null && rh != null) {
            if (h1.val != rh.val) {
                return false;
            }
            h1 = h1.next;
            rh = rh.next;

        }
        return true;
    }
}