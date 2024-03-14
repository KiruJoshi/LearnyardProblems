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
    public ListNode mergeNodes(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        current=head;
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=current.val;
            current=current.next;
        }
        //System.out.println("arrays "+Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        int ptr1=0;
        for(int i=1;i<arr.length;i++){
             sum+=arr[i];
            if(arr[i]==0){
                  list.add(sum);
                   sum=0;
                }
            
        }
        if(list.size()==0){
            return null;
        }
        ListNode resultHead=new ListNode();
         current=resultHead;
         current.val=list.get(0);
        for(int i=1;i<list.size();i++){
            ListNode testNode=new ListNode();
            current.next=testNode;
            current=testNode;
             current.val=list.get(i);
        }
      
        return resultHead;
    }
}