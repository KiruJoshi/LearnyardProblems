/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        dq.push(root);// 20
        while (dq.size() > 0) {
            int size = dq.size();// 1,2
            for (int i = 0; i < size; i++) {
                TreeNode top = dq.peekFirst();// 3
                dq.pollFirst();
                if (i == size - 1) {
                    ans.add(top.val);
                }
                if (top.left != null) {
                    dq.addLast(top.left);// 9
                }
                if (top.right != null) {// 20
                    dq.addLast(top.right);
                }
            }
        }
        return ans;
    }
}
// List<Integer> ans = new ArrayList<>();
//         if (root == null)
//         {
//             return ans;
//         }
//         Queue<TreeNode> que = new LinkedList<>();
//         que.add(root);  // Add root node to Queue 
//         while (que.size() > 0)
//         {
//             // Iterate on levels
//             int N = que.size();   // No. of nodes on a particular level 
//             for (int i=1; i<=N; i++)
//             {
//                 // Temporary node to remove and return element at front of queue. 
//                 TreeNode q = que.poll();
//                 // Right view of Binary Tree is last node in all levels 
//                 if (i == N)
//                 {
//                     ans.add(q.val);
//                 }
//                 // Add child nodes of current level to queue 
//                 if (q.left != null)
//                 {
//                     que.add(q.left);
//                 }
//                 if (q.right != null)
//                 {
//                     que.add(q.right);
//                 }
//             }
//         }
//          return ans; 
//     }