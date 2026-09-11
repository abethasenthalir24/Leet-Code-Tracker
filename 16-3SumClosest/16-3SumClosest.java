// Last updated: 9/11/2026, 10:20:08 AM
1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6
7        int closest = nums[0] + nums[1] + nums[2];
8
9        for (int i = 0; i < nums.length - 2; i++) {
10            int left = i + 1;
11            int right = nums.length - 1;
12
13            while (left < right) {
14                int sum = nums[i] + nums[left] + nums[right];
15
16                if (Math.abs(sum - target) < Math.abs(closest - target)) {
17                    closest = sum;
18                }
19
20                if (sum < target) {
21                    left++;
22                } else if (sum > target) {
23                    right--;
24                } else {
25                    return sum;
26                }
27            }
28        }
29
30        return closest;
31    }
32}