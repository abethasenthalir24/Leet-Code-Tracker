// Last updated: 8/1/2026, 7:33:17 AM
1class Solution {
2    public List<List<Integer>> levelOrder(TreeNode root) {
3        List<List<Integer>> result = new ArrayList<>();
4        if (root == null) return result;
5
6        Queue<TreeNode> queue = new LinkedList<>();
7        queue.offer(root);
8
9        while (!queue.isEmpty()) {
10            int size = queue.size();
11            List<Integer> level = new ArrayList<>();
12
13            for (int i = 0; i < size; i++) {
14                TreeNode node = queue.poll();
15                level.add(node.val);
16
17                if (node.left != null) queue.offer(node.left);
18                if (node.right != null) queue.offer(node.right);
19            }
20
21            result.add(level);
22        }
23
24        return result;
25    }
26}