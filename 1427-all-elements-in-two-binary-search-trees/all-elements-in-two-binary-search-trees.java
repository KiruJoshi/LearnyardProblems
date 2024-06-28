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
    public void inOrderHelper1(TreeNode root1, ArrayList<Integer> list1) {
        if (root1 == null)
            return;
        inOrderHelper1(root1.left, list1);
        list1.add(root1.val);
        inOrderHelper1(root1.right, list1);
    }

    public void inOrderHelper2(TreeNode root2, ArrayList<Integer> list2) {
        if (root2 == null)
            return;
        inOrderHelper2(root2.left, list2);
        list2.add(root2.val);
        inOrderHelper2(root2.right, list2);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        inOrderHelper1(root1, list1);
        inOrderHelper2(root2, list2);
        ans.addAll(list1);
        ans.addAll(list2);
        Collections.sort(ans);
        return ans;
    }
}