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
    public void helper1(TreeNode root1,ArrayList<Integer> list1){
        if(root1!=null){
           helper1(root1.left,list1);
            if(root1.left==null && root1.right==null)
                list1.add(root1.val);//6
              helper1(root1.right,list1);     
        }
    }
     public void helper2(TreeNode root2,ArrayList<Integer> list2){
        if(root2!=null){
           helper2(root2.left,list2);
            if(root2.left==null && root2.right==null)
                list2.add(root2.val);//6
              helper2(root2.right,list2);     
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        helper1(root1,list1);
        helper2(root2,list2);
        if(!list1.equals(list2))
            return false;
         return true;   
    }
}