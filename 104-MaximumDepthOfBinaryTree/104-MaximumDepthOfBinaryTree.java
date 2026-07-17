// Last updated: 7/17/2026, 2:58:41 PM
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(
                maxDepth(root.left),
                maxDepth(root.right)
        );
    }
}