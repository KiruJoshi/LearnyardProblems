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
    List<String> list = new ArrayList<>();
    public void binaryTreePathsHelper(TreeNode root,String currentString){
      if(root==null) return;
        currentString+=root.val;
      if(root.left==null && root.right==null){//means leaf node
          list.add(currentString);
       return;
      }
       currentString += "->"; 
       if(root.left!=null)
         binaryTreePathsHelper(root.left,currentString);
       if(root.right!=null)
           binaryTreePathsHelper(root.right,currentString);
    }
    public List<String> binaryTreePaths(TreeNode root) {
       binaryTreePathsHelper(root,"");
       return list; 
    }
}