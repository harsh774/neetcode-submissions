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
    int value, count;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return value;
    }

    // inOrder traversal
    private void inOrder(TreeNode root, int k){
        if(root == null || count == k) return;

        inOrder(root.left, k);
        // as we reaches to kth smallest we will return value.
        if(count < k){
            count++;
            if(count == k){
                value = root.val;
                return;
            }
        }
        inOrder(root.right, k);
    }
}
