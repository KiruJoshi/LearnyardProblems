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
    public ListNode oddEvenList(ListNode head) {
       ListNode current=head;
       int length=0;
       ArrayList<Integer> even_list=new ArrayList<>();
       ArrayList<Integer> odd_list=new ArrayList<>();
        while(current!=null){
            length++;
            current=current.next;
        }
        ListNode node=head;
        int result[]=new int[length];
        for(int i=0;i<result.length;i++){
            result[i]=node.val;
            node=node.next;
        }
        for(int i=0;i<result.length;i++){
            if(i%2==0){
                odd_list.add(result[i]);
            } else{
                even_list.add(result[i]);
            }
        }
       // System.out.println("array:" +Arrays.toString(result));
        node=head;
         int n=0,m=0;
      while(node!=null){
         if (n < odd_list.size()) {
                node.val = odd_list.get(n);
                n++;
            } else {
                node.val = even_list.get(m);
                m++;
              }
              node=node.next;
        }
       
        return head;
    }
}