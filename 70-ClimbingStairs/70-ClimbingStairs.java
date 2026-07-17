// Last updated: 7/17/2026, 2:59:01 PM
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
