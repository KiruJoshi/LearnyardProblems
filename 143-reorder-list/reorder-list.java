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
        int size = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        current = head;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = current.val;
            current = current.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, j = arr.length-1; i <= j; i++, j--) {
            list.add(arr[i]);
            list.add(arr[j]);
        }
        current = head;
        int i=0;
        while (current != null) {
            current.val = list.get(i);
            i++;
            current = current.next;
        }
       // return head;
    }
}