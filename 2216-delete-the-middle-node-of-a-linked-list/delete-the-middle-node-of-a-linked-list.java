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
    public ListNode deleteMiddle(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        int count = 0, element  = 0;
        while(current != null){
            count++;
            current=current.next;
        }
        int position = count/2;
        current = head;
        if(count == 1)
         return null;
        while(element != position){
            previous = current;
            current = current.next;
            element++;
         }
         previous.next = current.next;
         return head;
    }
}