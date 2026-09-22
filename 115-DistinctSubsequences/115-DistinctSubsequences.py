# Last updated: 9/22/2026, 9:19:00 AM
1class Solution:
2    def numDistinct(self, s, t):
3        dp = [0] * (len(t) + 1)
4        dp[0] = 1
5
6        for ch in s:
7            for j in range(len(t), 0, -1):
8                if ch == t[j - 1]:
9                    dp[j] += dp[j - 1]
10
11        return dp[len(t)]