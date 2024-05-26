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
    public boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q != null)
            return false;
        if (p != null && q == null)
            return false;
        if (p == null && q == null)
            return true;
        boolean isLeft = isMirror(p.left, q.left);
        boolean isRight = isMirror(p.right, q.right);
        if (isLeft && isRight && (p.val == q.val))
            return true;
        return false;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isMirror(p, q);
    }
}