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
    public void reorderList(ListNode head) {
     ListNode current=head;
    
     int size=0;
     while(current!=null){
        current=current.next;
        size++;
     }
     current=head;  
     int arr[]=new int[size];
     int i=0;
     while(current!=null){
        arr[i++]=current.val;
        current=current.next;
     }
     ArrayList<Integer> list=new ArrayList<>();
     for(int k=0,j=arr.length-1;k<=j;k++,j--){
        list.add(arr[k]);
        list.add(arr[j]);
     }
     System.out.println(list);
     current=head;
     for(int m=0;m<list.size();m++){
        if(current!=null){
       current.val = list.get(m);
       current=current.next;
      }
     } 
    }
}