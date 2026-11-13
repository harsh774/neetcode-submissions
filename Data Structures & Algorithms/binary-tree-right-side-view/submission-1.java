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
    private List<List<Integer>> levelOrders(TreeNode root){
        List<List<Integer>> levelOrders = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            List<Integer> levelNode = new ArrayList<>();

            for(int i=0; i<levelSize; i++){
                TreeNode currNode = q.poll();
                levelNode.add(currNode.val);

                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
            }
            levelOrders.add(levelNode);
        }
        return levelOrders;
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> levelOrders = levelOrders(root);

        List<Integer> res = new ArrayList<>();

        for(int i=0; i<levelOrders.size(); i++){
            int numberOfNode = levelOrders.get(i).size();

            res.add(levelOrders.get(i).get(numberOfNode-1));
        }
        return res;
    }
}
