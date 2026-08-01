// Last updated: 8/1/2026, 7:53:43 AM
1class Solution {
2    public int maxPoints(int[][] points) {
3        int n = points.length;
4        if (n <= 2) return n;
5
6        int ans = 2;
7
8        for (int i = 0; i < n; i++) {
9            Map<String, Integer> map = new HashMap<>();
10            int max = 0;
11
12            for (int j = i + 1; j < n; j++) {
13                int dx = points[j][0] - points[i][0];
14                int dy = points[j][1] - points[i][1];
15
16                int g = gcd(dx, dy);
17                dx /= g;
18                dy /= g;
19
20                if (dx < 0) {
21                    dx = -dx;
22                    dy = -dy;
23                } else if (dx == 0) {
24                    dy = 1;
25                } else if (dy == 0) {
26                    dx = 1;
27                }
28
29                String key = dx + "/" + dy;
30                map.put(key, map.getOrDefault(key, 0) + 1);
31                max = Math.max(max, map.get(key));
32            }
33
34            ans = Math.max(ans, max + 1);
35        }
36
37        return ans;
38    }
39
40    private int gcd(int a, int b) {
41        if (b == 0) return Math.abs(a);
42        return gcd(b, a % b);
43    }
44}