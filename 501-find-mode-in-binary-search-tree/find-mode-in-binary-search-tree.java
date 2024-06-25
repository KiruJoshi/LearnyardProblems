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
    int mode = 0;

    public void helper(HashMap<Integer, Integer> map, TreeNode root) {
        if(root==null) return;
        helper(map, root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        mode = Math.max(mode, map.get(root.val));
        helper(map, root.right);
    }

    public int[] findMode(TreeNode root) {
    HashMap<Integer, Integer> map=new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();
      helper(map,root);  
      for(Map.Entry<Integer, Integer> entry:map.entrySet()){
        if(entry.getValue()==mode){
            list.add(entry.getKey());
        }
      }
    int arr[]=new int[list.size()];
      for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
      }
    return arr;
    }
}