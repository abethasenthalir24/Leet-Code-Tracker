// Last updated: 9/22/2026, 9:11:02 AM
1class Solution {
2    public int calculate(String s) {
3        int result = 0;
4        int last = 0;
5        int num = 0;
6        char sign = '+';
7
8        for (int i = 0; i < s.length(); i++) {
9            char ch = s.charAt(i);
10
11            if (Character.isDigit(ch)) {
12                num = num * 10 + (ch - '0');
13            }
14
15            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
16                if (sign == '+') {
17                    result += last;
18                    last = num;
19                } else if (sign == '-') {
20                    result += last;
21                    last = -num;
22                } else if (sign == '*') {
23                    last = last * num;
24                } else if (sign == '/') {
25                    last = last / num;
26                }
27
28                sign = ch;
29                num = 0;
30            }
31        }
32
33        return result + last;
34    }
35}