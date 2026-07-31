// Last updated: 7/31/2026, 8:58:20 AM
1class Solution {
2    public TreeNode sortedArrayToBST(int[] nums) {
3        return build(nums, 0, nums.length - 1);
4    }
5
6    public TreeNode build(int[] nums, int left, int right) {
7        if (left > right) {
8            return null;
9        }
10
11        int mid = left + (right - left) / 2;
12
13        TreeNode root = new TreeNode(nums[mid]);
14
15        root.left = build(nums, left, mid - 1);
16        root.right = build(nums, mid + 1, right);
17
18        return root;
19    }
20}