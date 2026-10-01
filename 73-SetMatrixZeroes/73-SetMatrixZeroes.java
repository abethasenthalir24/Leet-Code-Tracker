// Last updated: 10/1/2026, 9:12:53 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean firstRow = false;
7        boolean firstCol = false;
8
9        for (int j = 0; j < n; j++) {
10            if (matrix[0][j] == 0) {
11                firstRow = true;
12            }
13        }
14
15        for (int i = 0; i < m; i++) {
16            if (matrix[i][0] == 0) {
17                firstCol = true;
18            }
19        }
20
21        for (int i = 1; i < m; i++) {
22            for (int j = 1; j < n; j++) {
23                if (matrix[i][j] == 0) {
24                    matrix[i][0] = 0;
25                    matrix[0][j] = 0;
26                }
27            }
28        }
29
30        for (int i = 1; i < m; i++) {
31            for (int j = 1; j < n; j++) {
32                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
33                    matrix[i][j] = 0;
34                }
35            }
36        }
37
38        if (firstRow) {
39            for (int j = 0; j < n; j++) {
40                matrix[0][j] = 0;
41            }
42        }
43
44        if (firstCol) {
45            for (int i = 0; i < m; i++) {
46                matrix[i][0] = 0;
47            }
48        }
49    }
50}