// Last updated: 7/17/2026, 2:57:37 PM

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Codec {

 
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        buildString(node.left, sb);
        buildString(node.right, sb);
    }

    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        java.util.LinkedList<String> list = new java.util.LinkedList<>(java.util.Arrays.asList(values));
        return buildTree(list);
    }

    private TreeNode buildTree(java.util.LinkedList<String> list) {
        String val = list.removeFirst();
        if (val.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(list);
        node.right = buildTree(list);
        return node;
    }
}
