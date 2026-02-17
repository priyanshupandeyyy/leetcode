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
    int msum=Integer.MIN_VALUE;
    private int maxpath(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(0,maxpath(root.left));
        int right=Math.max(0,maxpath(root.right));
        msum=Math.max(msum,left+right+root.val);

        return Math.max(left,right)+root.val;
    }

    public int maxPathSum(TreeNode root) {
        
        maxpath(root);
        return msum;
    }
}