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
    public ListNode doubleIt(ListNode head) {
        ListNode ptr = head ,prev=null , next=null;
        // reversing the list
        while(ptr!=null){
            next = ptr.next;
            ptr.next=prev;
            prev = ptr;
            ptr = next;
        }
        head = prev;
      //  return head;

       // creating new list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry=0 , digit=0,product=1;

        ptr = head;

        while(ptr!=null || carry!=0){
            int value = (ptr==null) ? 0 : ptr.val;
            product = 2*value + carry;
            carry = product/10;
            ListNode node = new ListNode(product%10);
            tail.next = node;
            tail = tail.next;
            ptr= (ptr!=null) ? ptr.next : null ;
        }
        //detaching dummy

        ListNode ans = dummy.next;
        dummy.next = null;

        // reversing the new list
        ptr = ans;
        next =prev = null;

        while(ptr!=null){
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }
        
        ans = prev;

        return ans;
    }
}    