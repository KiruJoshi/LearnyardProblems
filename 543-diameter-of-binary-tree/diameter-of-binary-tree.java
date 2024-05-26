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
    int max = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public void diameterHelper(TreeNode root) {
        if (root == null)
            return;
        diameterHelper(root.left);
        diameterHelper(root.right);
        int max_left = maxDepth(root.left);
        int max_right = maxDepth(root.right);
        max = Math.max((max_left + max_right), max);
    }

    public int diameterOfBinaryTree(TreeNode root) {
         diameterHelper(root);
         return max;
    }
}
