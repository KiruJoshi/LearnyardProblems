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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        if(head.next == null ){
            return null;
        }
        ListNode temp = head;
        int count = 1;
      //  ListNode prev = null;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        } // 5-2
        temp = head;
        ListNode prev=head;
        if(count==n){
            head=temp.next;
            return head;
            }
        for (int i = 0; i < count - n; i++) {
            if(i>0){
            prev=prev.next;
           }
             temp=temp.next;   
         }
        // System.out.println(prev.val+" "+temp.val);
      prev.next = temp.next;
        

        return head;
    
     }
}