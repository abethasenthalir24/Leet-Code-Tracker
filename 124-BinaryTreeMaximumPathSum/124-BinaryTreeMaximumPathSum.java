// Last updated: 8/1/2026, 7:15:22 AM
1class Solution {
2    int maxSum = Integer.MIN_VALUE;
3
4    public int maxPathSum(TreeNode root) {
5        dfs(root);
6        return maxSum;
7    }
8
9    private int dfs(TreeNode node) {
10        if (node == null) return 0;
11
12        int left = Math.max(0, dfs(node.left));
13        int right = Math.max(0, dfs(node.right));
14
15        maxSum = Math.max(maxSum, node.val + left + right);
16
17        return node.val + Math.max(left, right);
18    }
19}