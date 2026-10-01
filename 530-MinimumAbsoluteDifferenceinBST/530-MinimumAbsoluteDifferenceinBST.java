// Last updated: 10/1/2026, 9:17:28 AM
1class Solution {
2    private int minDiff = Integer.MAX_VALUE;
3    private TreeNode prev = null;
4
5    public int getMinimumDifference(TreeNode root) {
6        inorder(root);
7        return minDiff;
8    }
9
10    private void inorder(TreeNode node) {
11        if (node == null) {
12            return;
13        }
14
15        inorder(node.left);
16
17        if (prev != null) {
18            minDiff = Math.min(minDiff, node.val - prev.val);
19        }
20
21        prev = node;
22
23        inorder(node.right);
24    }
25}