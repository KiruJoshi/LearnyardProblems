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
    ArrayList<Integer> list=new ArrayList<>();
    public void inorderHelper(TreeNode root){
        if(root==null)
         return ;
         inorderHelper(root.left);
         list.add(root.val);
         inorderHelper(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
       inorderHelper(root);
       return list.get(k-1); 
    }
}