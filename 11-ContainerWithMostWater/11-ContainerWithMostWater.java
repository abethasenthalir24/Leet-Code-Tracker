// Last updated: 9/1/2026, 9:15:08 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6
7        while (left < right) {
8            int width = right - left;
9            int h = Math.min(height[left], height[right]);
10            int area = width * h;
11
12            if (area > maxArea) {
13                maxArea = area;
14            }
15
16            if (height[left] < height[right]) {
17                left++;
18            } else {
19                right--;
20            }
21        }
22
23        return maxArea;
24    }
25}