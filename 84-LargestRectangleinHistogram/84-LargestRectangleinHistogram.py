# Last updated: 9/22/2026, 9:17:41 AM
1class Solution:
2    def largestRectangleArea(self, heights):
3        stack = []
4        max_area = 0
5        heights.append(0)
6
7        for i in range(len(heights)):
8            while stack and heights[i] < heights[stack[-1]]:
9                h = heights[stack.pop()]
10
11                if stack:
12                    width = i - stack[-1] - 1
13                else:
14                    width = i
15
16                max_area = max(max_area, h * width)
17
18            stack.append(i)
19
20        return max_area