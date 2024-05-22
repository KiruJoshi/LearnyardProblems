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
class Trio {
    boolean isBST;
    int maxVal;
    int minVal;
    int sum;
    Trio(boolean a, int mx, int mn,int x) {
        isBST = a;
        maxVal = mx;
        minVal = mn;
        sum=x;
    }
}

class Solution {
    static int ans=0;
    Trio helperValidBST(TreeNode cur) {
    if(cur == null)
        return new Trio(true, Integer.MIN_VALUE, Integer.MAX_VALUE,0);
    
        Trio leftTrio = helperValidBST(cur.left);
        Trio rightTrio = helperValidBST(cur.right);

        boolean leftPass = cur.left != null ? (leftTrio.isBST == true && leftTrio.maxVal < cur.val) : true;
        boolean rightPass = cur.right != null ? (rightTrio.isBST == true && rightTrio.minVal > cur.val) : true;

        boolean isBST = leftPass && rightPass;
        int sum1=cur.val+leftTrio.sum+rightTrio.sum;
        if(isBST==true){
            ans=Math.max(ans,sum1);
        }
        int curMax = Math.max(Math.max(cur.val, leftTrio.maxVal), rightTrio.maxVal);
        int curMin = Math.min(Math.min(cur.val, leftTrio.minVal), rightTrio.minVal);

        return new Trio(isBST, curMax, curMin,sum1);
    }
    public int maxSumBST(TreeNode root) {
        ans=0;
        helperValidBST(root);
        return ans;
    }
}