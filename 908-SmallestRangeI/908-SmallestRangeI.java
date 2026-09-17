// Last updated: 9/17/2026, 9:46:18 AM
1class Solution {
2    public int smallestRangeI(int[] nums, int k) {
3        int min = nums[0];
4        int max = nums[0];
5
6        for (int num : nums) {
7            min = Math.min(min, num);
8            max = Math.max(max, num);
9        }
10
11        return Math.max(0, max - min - 2 * k);
12    }
13}