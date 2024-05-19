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
    public int sumHelper(TreeNode root) {
        if (root == null)
            return 0;
        int leftSum = sumHelper(root.left);
        int rightSum = sumHelper(root.right);
        return (root.val + leftSum + rightSum);
    }

    private void computeTilt(TreeNode node) {
        int totalTilt = 0;
        if (node == null) {
            return ;
        }
        int leftSum = sumHelper(node.left);
        int rightSum = sumHelper(node.right);
        int tilt = Math.abs(leftSum - rightSum);
        node.val = tilt;
        computeTilt(node.left);
        computeTilt(node.right);

    }

    public int findTilt(TreeNode root) {
       computeTilt(root);
     int sum =  sumHelper(root);
        return sum;
    }
}