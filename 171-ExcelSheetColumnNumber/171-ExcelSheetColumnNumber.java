// Last updated: 9/17/2026, 9:55:43 AM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int result = 0;
4
5        for (int i = 0; i < columnTitle.length(); i++) {
6            int value = columnTitle.charAt(i) - 'A' + 1;
7            result = result * 26 + value;
8        }
9
10        return result;
11    }
12}