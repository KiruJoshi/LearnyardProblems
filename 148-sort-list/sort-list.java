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
    public ListNode sortList(ListNode head) {

      ListNode dummy=new ListNode(0);
      ListNode current=head;
      ArrayList<Integer> list=new ArrayList<>();
       while(current!=null){
           list.add(current.val);
           current=current.next;
        }
        current=head;
        Collections.sort(list);
        for(int ele:list){
           current.val=ele;
           current=current.next;
        }
        return head;
    }
}