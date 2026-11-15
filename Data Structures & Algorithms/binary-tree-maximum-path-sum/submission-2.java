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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return maxSum;
    }

    private int pathSum(TreeNode root){
        if(root == null || root.val<0) return 0;

        int leftMax = pathSum(root.left);
        int rightMax = pathSum(root.right);

        maxSum = Math.max(maxSum, root.val + leftMax + rightMax);

        return root.val + Math.max(leftMax,rightMax);

    }
}
