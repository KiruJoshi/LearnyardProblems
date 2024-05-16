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
    public List<Double> averageOfLevels(TreeNode root) {
    Deque<TreeNode> dq = new ArrayDeque<>();
    List<Integer> ans = new ArrayList<>();
    List<Double> temp = new ArrayList<>();
    double sum=0;
     if(root == null)
            return temp;  
    dq.push(root);//3
    while(dq.size()>0){
        int size=dq.size();//1
        ans.clear();
        sum=0;
     while(size-- > 0){
       TreeNode top = dq.peekFirst();
        dq.pollFirst();
        if(top.left!=null){
            dq.addLast(top.left);//9
        }
         if(top.right!=null){//20
            dq.addLast(top.right);
        }
        ans.add(top.val);//9,20
      //  System.out.println(ans);
      }
      for(int i=0; i<ans.size();i++){
        sum+=ans.get(i);
      }
      
     temp.add(sum/ans.size());//
     }
     return temp;
    }
} 

