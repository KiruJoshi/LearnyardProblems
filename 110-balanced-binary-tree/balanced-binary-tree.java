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
    public int maxHelper(TreeNode root){
        if(root==null)
         return 0;
         return 1+Math.max(maxHelper(root.left), maxHelper(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
         return true;
         int lh=maxHelper(root.left);
         int rh=maxHelper(root.right);
         int diff =Math.abs(lh-rh);
         if(diff>1) return false;
         return (isBalanced(root.left) && isBalanced(root.right));
 

    }
}