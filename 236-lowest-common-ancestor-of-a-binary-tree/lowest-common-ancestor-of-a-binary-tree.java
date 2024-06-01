/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans=new TreeNode();
   
    public TreeNode lowestCommonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
       if(root==null || root==p || root==q)
         return root;
       TreeNode right= lowestCommonAncestorHelper(root.right,p,q);
       TreeNode left= lowestCommonAncestorHelper(root.left,p,q);
       if(left!=null && right!=null)
        return root;
       return left!=null?left:right; 
       
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return lowestCommonAncestorHelper(root,p,q);

    }
}