// Last updated: 7/22/2026, 7:23:51 PM
class Solution {
    public boolean isPowerOfFour(int n) {

        if (n <= 0)
            return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
}