// Last updated: 7/17/2026, 2:57:22 PM
class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, node.val - prev.val);
        }

        prev = node;

        inorder(node.right);
    }
}