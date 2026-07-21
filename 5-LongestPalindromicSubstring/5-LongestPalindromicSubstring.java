// Last updated: 7/21/2026, 7:54:17 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 2)
4            return s;
5
6        int start = 0;
7        int end = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10            int len1 = expand(s, i, i);       
11            int len2 = expand(s, i, i + 1);   
12
13            int len = Math.max(len1, len2);
14
15            if (len > end - start + 1) {
16                start = i - (len - 1) / 2;
17                end = i + len / 2;
18            }
19        }
20
21        return s.substring(start, end + 1);
22    }
23
24    private int expand(String s, int left, int right) {
25        while (left >= 0 && right < s.length() &&
26               s.charAt(left) == s.charAt(right)) {
27            left--;
28            right++;
29        }
30
31        return right - left - 1;
32    }
33}