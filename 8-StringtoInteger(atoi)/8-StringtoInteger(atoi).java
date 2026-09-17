// Last updated: 9/17/2026, 10:24:55 AM
1class Solution {
2    public int myAtoi(String s) {
3        int i = 0;
4        int n = s.length();
5
6        while (i < n && s.charAt(i) == ' ') {
7            i++;
8        }
9
10        int sign = 1;
11
12        if (i < n && s.charAt(i) == '-') {
13            sign = -1;
14            i++;
15        } else if (i < n && s.charAt(i) == '+') {
16            i++;
17        }
18
19        int result = 0;
20
21        while (i < n && Character.isDigit(s.charAt(i))) {
22            int digit = s.charAt(i) - '0';
23
24            if (result > (Integer.MAX_VALUE - digit) / 10) {
25                if (sign == 1) {
26                    return Integer.MAX_VALUE;
27                } else {
28                    return Integer.MIN_VALUE;
29                }
30            }
31
32            result = result * 10 + digit;
33            i++;
34        }
35
36        return result * sign;
37    }
38}