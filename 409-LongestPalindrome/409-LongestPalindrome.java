// Last updated: 9/17/2026, 9:57:28 AM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count = new int[128];
4        int length = 0;
5        boolean odd = false;
6
7        for (char c : s.toCharArray()) {
8            count[c]++;
9        }
10
11        for (int n : count) {
12            length += (n / 2) * 2;
13
14            if (n % 2 == 1) {
15                odd = true;
16            }
17        }
18
19        if (odd) {
20            length++;
21
22        }
23
24        return length;
25    }
26}