// Last updated: 9/27/2026, 6:53:01 PM
1class Solution {
2    public double myPow(double x, int n) {
3        long power = n;
4
5        if (power < 0) {
6            x = 1 / x;
7            power = -power;
8        }
9
10        double result = 1.0;
11
12        while (power > 0) {
13            if (power % 2 == 1) {
14                result *= x;
15            }
16
17            x *= x;
18            power /= 2;
19        }
20
21        return result;
22    }
23}