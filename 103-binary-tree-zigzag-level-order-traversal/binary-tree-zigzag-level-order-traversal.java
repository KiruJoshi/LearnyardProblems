/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return ans;
        queue.add(root);
        while(queue.size() > 0){
            int size = queue.size();
            List<Integer> subAns = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode candidate = queue.pop();
                subAns.add(candidate.val);
                if(candidate.left != null){
                    queue.add(candidate.left);
                }
                if(candidate.right != null){
                    queue.add(candidate.right);
                }
            }
            ans.add(subAns);
        }
        for(int i=0;i<ans.size();i++){
            if(i%2 != 0){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}