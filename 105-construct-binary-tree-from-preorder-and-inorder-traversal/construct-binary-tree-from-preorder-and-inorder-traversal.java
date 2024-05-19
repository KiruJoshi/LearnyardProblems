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
//  preorder= 3, 9, 20, 15,7   NLR
//  inorder=  9,3,15,20,7      LNR 
//        root-3
//        leftroot=9 
//        rightroot=15,20,7-20 15left 7-right
class Solution {
    public TreeNode buildTreeHelper(int[] preorder,int ps, int pe, int[] inorder, int is, int ie,HashMap<Integer, Integer> map){
       if(ps>pe || is>ie)
        return null;
       TreeNode root = new TreeNode(preorder[ps]);
        int rootElementIndex = map.get(root.val);
        int numsLeft = rootElementIndex - is;
        
        root.left = buildTreeHelper(preorder, ps + 1, ps + numsLeft, inorder, is, rootElementIndex - 1, map);
        root.right = buildTreeHelper(preorder, ps + numsLeft + 1, pe, inorder, rootElementIndex + 1, ie, map);
        
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }
}