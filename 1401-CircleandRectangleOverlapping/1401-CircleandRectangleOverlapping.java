// Last updated: 9/19/2026, 9:00:16 AM
1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter,
3                                int x1, int y1, int x2, int y2) {
4
5        int x = Math.max(x1, Math.min(xCenter, x2));
6        int y = Math.max(y1, Math.min(yCenter, y2));
7
8        int distance = (x - xCenter) * (x - xCenter)
9                     + (y - yCenter) * (y - yCenter);
10
11        return distance <= radius * radius;
12    }
13}