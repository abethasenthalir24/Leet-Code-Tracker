// Last updated: 9/1/2026, 9:02:00 AM
1
2class Solution {
3    public String convert(String s, int numRows) {
4        if (numRows == 1 || numRows >= s.length()) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9
10        for (int i = 0; i < numRows; i++) {
11            rows[i] = new StringBuilder();
12        }
13
14        int row = 0;
15        int direction = 1;
16
17        for (char c : s.toCharArray()) {
18            rows[row].append(c);
19
20            if (row == 0) {
21                direction = 1;
22            } else if (row == numRows - 1) {
23                direction = -1;
24            }
25
26            row += direction;
27        }
28
29        StringBuilder result = new StringBuilder();
30
31        for (StringBuilder r : rows) {
32            result.append(r);
33        }
34
35        return result.toString();
36    }
37}
38
39