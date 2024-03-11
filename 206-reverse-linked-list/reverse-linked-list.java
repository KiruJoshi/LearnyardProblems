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
    public ListNode reverseList(ListNode head) {
        ListNode rh = null;
        ListNode t = head;//temp=1
        while (head != null)
        {
            head = head.next;//head=2,3
            t.next = rh;//t.next=null;,1
            rh = t;//rh=2,1
            t = head;//t=2,
        }
         return rh;   
    }
}