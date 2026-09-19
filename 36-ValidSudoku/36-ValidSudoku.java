// Last updated: 9/19/2026, 9:05:27 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4        HashSet<String> set = new HashSet<>();
5
6        for (int i = 0; i < 9; i++) {
7            for (int j = 0; j < 9; j++) {
8
9                if (board[i][j] == '.') {
10                    continue;
11                }
12
13                char num = board[i][j];
14
15                String row = num + "row" + i;
16                String col = num + "col" + j;
17                String box = num + "box" + (i / 3) + (j / 3);
18
19                if (set.contains(row) || set.contains(col) || set.contains(box)) {
20                    return false;
21                }
22
23                set.add(row);
24                set.add(col);
25                set.add(box);
26            }
27        }
28
29        return true;
30    }
31}