// Last updated: 9/27/2026, 7:17:25 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int reach = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > reach) {
7                return false;
8            }
9
10            reach = Math.max(reach, i + nums[i]);
11
12            if (reach >= nums.length - 1) {
13                return true;
14            }
15        }
16
17        return true;
18    }
19}