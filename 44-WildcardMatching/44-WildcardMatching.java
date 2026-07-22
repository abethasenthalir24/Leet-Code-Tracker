// Last updated: 7/22/2026, 7:21:38 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0;
4        int j = 0;
5        int star = -1;
6        int match = 0;
7
8        while (i < s.length()) {
9            if (j < p.length() &&
10                (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
11                i++;
12                j++;
13            } 
14            else if (j < p.length() && p.charAt(j) == '*') {
15                star = j;
16                match = i;
17                j++;
18            } 
19            else if (star != -1) {
20                j = star + 1;
21                match++;
22                i = match;
23            } 
24            else {
25                return false;
26            }
27        }
28
29        while (j < p.length() && p.charAt(j) == '*') {
30            j++;
31        }
32
33        return j == p.length();
34    }
35}