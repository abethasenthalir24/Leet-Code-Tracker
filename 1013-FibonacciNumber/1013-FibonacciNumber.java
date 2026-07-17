// Last updated: 7/17/2026, 2:56:47 PM
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
