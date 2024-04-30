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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode current = head;
        int value1 = 0, value2 = 0, size=0;
        int start = k;
        while(current!=null){
            size++;
            current = current.next;
        }
        current = head;
        while(start-->1){
            current = current.next;
        }
        //(m - n + 1)//5-2+1=4
        value1 = current.val;//2
        int last = (size-k+1);
         current = head;
        while(last-->1){
            current = current.next;
        }
        value2 = current.val;
        current.val= value1;
        start=k;
        current = head;
        while(start-->1){
            current = current.next;
        }
        current.val = value2;
        return head;
    }
}