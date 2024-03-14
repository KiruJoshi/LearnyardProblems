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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode current=head;
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        int arr[]=new int[length];
        current=head;
        for(int i=0;i<length;i++){
            arr[i]=current.val;
            current=current.next;
        }
        int temp=0;
        for(int i=left-1,j=right-1;i<=j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        } int i=0;
        current=head;
        while(current!=null){
            current.val=arr[i++];
            current=current.next;
        }
        return head;
    }
}