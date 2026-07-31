// Last updated: 7/31/2026, 9:00:24 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int result = 0;
5
6        for (int num : nums) {
7            result ^= num;
8        }
9
10        return result;
11    }
12}