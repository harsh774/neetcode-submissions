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
    private List<Integer> levelOrdersToGetSideView(TreeNode root){
        List<Integer> sideView = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();

            sideView.add(q.peek().val);
            for(int i=0; i<levelSize; i++){
                TreeNode currNode = q.poll();
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
              
            }
        }
        return sideView;
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        return levelOrdersToGetSideView(root);
        // List<List<Integer>> levelOrders = levelOrders(root);

        // List<Integer> res = new ArrayList<>();

        // for(int i=0; i<levelOrders.size(); i++){
        //     int numberOfNode = levelOrders.get(i).size();
        //     res.add(levelOrders.get(i).get(numberOfNode-1));
        // }
        // return res;
    }
}
