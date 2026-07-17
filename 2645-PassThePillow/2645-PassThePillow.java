// Last updated: 7/17/2026, 2:56:00 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle;

        if (t <= n - 1) {
            return 1 + t;
        } else {
            return n - (t - (n - 1));
        }
    }
}
