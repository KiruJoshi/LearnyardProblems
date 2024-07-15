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
    public int[] nextLargerNodes(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        ListNode present = head;
        int result[] = new int[size];
        int i = 0;
        while (size-- > 0) {
            int check = present.val;
            current = present;
            while (current != null) {
                if (current.val > check) {
                    result[i] = current.val;
                    break;
                }
                current = current.next;
            }
              i++;
            present = present.next;
        }
        return result;
    }
}