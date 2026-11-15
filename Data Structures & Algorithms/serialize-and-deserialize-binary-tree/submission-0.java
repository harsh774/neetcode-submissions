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

public class Codec {
    private void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("N").append(",");
        } else {
            sb.append(node.val).append(",");
            dfs(node.left, sb);
            dfs(node.right, sb);
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private int idx=0;

    private TreeNode buildTree(String[] nodes){
        String node = nodes[idx++];

        if(node.equals("N")){
            return null;
        }

        TreeNode treeNode = new TreeNode(Integer.parseInt(node));
        treeNode.left = buildTree(nodes);
        treeNode.right = buildTree(nodes);

        return treeNode;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        return buildTree(nodes);
    }
}
