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
    int size=0;
    public int nodeCountHelper(TreeNode root){
    if(root==null)
         return 0;
    int leftSize=nodeCountHelper(root.left);
     int rightSize=nodeCountHelper(root.right);
     return (1+leftSize+rightSize);
    }
    public int sumHelper(TreeNode root){
        if(root==null)
         return 0;
     int leftSum=sumHelper(root.left);
     int rightSum=sumHelper(root.right);
     return (root.val+leftSum+rightSum);
    }
    public void averageHelper(TreeNode root){
        if(root==null)
         return ;
       int sum = sumHelper(root);
       int count=nodeCountHelper(root);
       int average = sum/count;
       if(average==root.val){
            size++;
       }
       averageHelper(root.left);
       averageHelper(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
      int result=0;
       averageHelper(root);
        return size;
    }
}