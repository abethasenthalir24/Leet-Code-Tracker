// Last updated: 7/22/2026, 7:09:17 PM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3
4        if (n <= 0)
5            return false;
6
7        while (n % 4 == 0) {
8            n /= 4;
9        }
10
11        return n == 1;
12    }
13}