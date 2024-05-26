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
    public boolean findHelper(TreeNode root,TreeNode current, int value) {
        if (root == null) return false;
         if (value > root.val) return findHelper(root.right,current, value);
         else if (value < root.val) return findHelper(root.left,current, value); 
         else if (value == root.val) return root != current;   
        return false;
    }

    public boolean sumHelper(TreeNode root,TreeNode currentNode, int k) {
          if (currentNode == null)
            return false;
        if(findHelper(root,currentNode, (k - currentNode.val))) 
          return true;
        return sumHelper(root,currentNode.left,k) || sumHelper(root,currentNode.right,k);
    }

    public boolean findTarget(TreeNode root, int k) {
        return sumHelper(root,root, k);
    }
}