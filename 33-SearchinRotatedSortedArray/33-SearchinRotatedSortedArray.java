// Last updated: 7/17/2026, 2:52:17 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            if (nums[left] <= nums[mid]) {
14                if (target >= nums[left] && target < nums[mid]) {
15                    right = mid - 1;
16                } else {
17                    left = mid + 1;
18                }
19            }
20
21            else {
22                if (target > nums[mid] && target <= nums[right]) {
23                    left = mid + 1;
24                } else {
25                    right = mid - 1;
26                }
27            }
28        }
29
30        return -1;
31    }
32}