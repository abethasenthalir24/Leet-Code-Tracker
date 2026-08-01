// Last updated: 8/1/2026, 7:51:08 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0) return 0;
4
5        int cols = matrix[0].length;
6        int[] heights = new int[cols];
7        int maxArea = 0;
8
9        for (char[] row : matrix) {
10            for (int i = 0; i < cols; i++) {
11                if (row[i] == '1') {
12                    heights[i]++;
13                } else {
14                    heights[i] = 0;
15                }
16            }
17            maxArea = Math.max(maxArea, largestRectangleArea(heights));
18        }
19
20        return maxArea;
21    }
22
23    private int largestRectangleArea(int[] heights) {
24        Stack<Integer> stack = new Stack<>();
25        int maxArea = 0;
26
27        for (int i = 0; i <= heights.length; i++) {
28            int h = (i == heights.length) ? 0 : heights[i];
29
30            while (!stack.isEmpty() && h < heights[stack.peek()]) {
31                int height = heights[stack.pop()];
32                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
33                maxArea = Math.max(maxArea, height * width);
34            }
35
36            stack.push(i);
37        }
38
39        return maxArea;
40    }
41}