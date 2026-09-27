// Last updated: 9/27/2026, 7:35:53 PM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        int n = triangle.size();
4
5        int[] dp = new int[n];
6
7        for (int i = 0; i < n; i++) {
8            dp[i] = triangle.get(n - 1).get(i);
9        }
10
11        for (int i = n - 2; i >= 0; i--) {
12            for (int j = 0; j <= i; j++) {
13                dp[j] = triangle.get(i).get(j)
14                        + Math.min(dp[j], dp[j + 1]);
15            }
16        }
17
18        return dp[0];
19    }
20}