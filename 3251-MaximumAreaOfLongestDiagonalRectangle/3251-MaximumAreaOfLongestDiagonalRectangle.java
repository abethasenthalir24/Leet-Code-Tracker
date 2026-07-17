// Last updated: 7/17/2026, 2:55:55 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int l = rect[0];
            int w = rect[1];

            int diagonal = l * l + w * w;
            int area = l * w;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}