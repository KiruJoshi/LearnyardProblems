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
    public ListNode mergeKLists(ListNode[] lists) {
     ArrayList<Integer> list = new ArrayList<>();
     for(int i=0;i<lists.length;i++){
      ListNode ptrNode=lists[i];
      while(ptrNode!=null){
        list.add(ptrNode.val);
        ptrNode=ptrNode.next;
      }  
     }   
     Collections.sort(list);
     if(list.size()==0) return null;
     ListNode result=new ListNode(list.get(0));
     ListNode ans=result;
     for(int i=1;i<list.size();i++){
        ListNode temp=new ListNode(list.get(i));
        ans.next=temp;
        ans=ans.next;
     }
        return result;
    }
}