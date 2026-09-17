// Last updated: 9/17/2026, 9:53:01 AM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i = 0;
4        int j = 0;
5
6        while (j < typed.length()) {
7            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
8                i++;
9                j++;
10            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
11                j++;
12            } else {
13                return false;
14            }
15        }
16
17        return i == name.length();
18    }
19}