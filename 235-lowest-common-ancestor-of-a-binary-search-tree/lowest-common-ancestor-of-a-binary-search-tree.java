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
    public TreeNode helperLCA(TreeNode root, TreeNode p, TreeNode q){
      if((p!=null && q==null) || (p==null && q!=null)) return root;
      if(root==null) return null;
      if(p.val<root.val && q.val<root.val)
         return helperLCA(root.left,p,q);
       if(p.val>root.val && q.val>root.val) 
          return helperLCA(root.right,p,q);  
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     return helperLCA(root,p,q);   
    }
}