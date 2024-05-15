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
     public void postOrderHelper(TreeNode root, List<Integer> list){
        if(root!=null){
            postOrderHelper(root.left,list);
             postOrderHelper(root.right,list);
             list.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        postOrderHelper(root, list); 
        return list;  
    }
}