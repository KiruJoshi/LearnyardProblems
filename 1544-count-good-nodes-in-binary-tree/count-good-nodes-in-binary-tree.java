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
     int Count = 0;
    public int goodNodes(TreeNode root) {
    
        int Max = Integer.MIN_VALUE;
        preOrder(root, Max);
        return Count;
    }

    public void preOrder(TreeNode root, int Max) {
        if (root == null) {
            return;
        }

        if (root.val >= Max) {
            Max = root.val;
            Count++;
        }
        preOrder(root.left, Max);
        preOrder(root.right, Max);
    }
}

