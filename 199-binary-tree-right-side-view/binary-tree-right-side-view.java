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
    public void helper(TreeNode root,TreeMap<Integer, Integer> map, int level){
          if(root==null)
           return ;
        if(map.get(level)==null){
            map.put(level,root.val);
        }

        helper(root.right,map,level+1);
        helper(root.left,map,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      TreeMap<Integer, Integer> map = new TreeMap<>();
       helper(root,map,0);
       for(Map.Entry<Integer, Integer> ele:map.entrySet()){
        list.add(ele.getValue());
       }
       return list;
    }
}