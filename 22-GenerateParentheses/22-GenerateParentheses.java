// Last updated: 9/19/2026, 9:01:07 AM
1import java.util.*;
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5        List<String> result = new ArrayList<>();
6        generate("", 0, 0, n, result);
7        return result;
8    }
9
10    public void generate(String s, int open, int close, int n, List<String> result) {
11        if (s.length() == 2 * n) {
12            result.add(s);
13            return;
14        }
15
16        if (open < n) {
17            generate(s + "(", open + 1, close, n, result);
18        }
19
20        if (close < open) {
21            generate(s + ")", open, close + 1, n, result);
22        }
23    }
24}