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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode ptr = head, prev = null, next = null;
        st.push(ptr.val);
        ptr = ptr.next;
        while (ptr != null) {
            while (!st.empty() && st.peek() < ptr.val) {
                st.pop();
            }
            st.push(ptr.val);
            ptr = ptr.next;
        }
        //  for (Integer element : st) {
        //      System.out.println(element);
        //  }
      // creating new LinkedList
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!st.empty()) {
            ListNode node = new ListNode(st.pop());
            tail.next = node;
            tail = tail.next;
        }

        // reversing linked list
        ListNode ans = dummy.next;
        dummy.next = null;
        ptr = ans;
        while (ptr != null) {
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }

        return prev;
    }
}
