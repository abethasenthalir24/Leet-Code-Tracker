// Last updated: 9/19/2026, 9:07:44 AM
1class Solution {
2    public int jump(int[] nums) {
3        int jumps = 0;
4        int end = 0;
5        int farthest = 0;
6
7        for (int i = 0; i < nums.length - 1; i++) {
8            farthest = Math.max(farthest, i + nums[i]);
9
10            if (i == end) {
11                jumps++;
12                end = farthest;
13            }
14        }
15
16        return jumps;
17    }
18}