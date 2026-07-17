// Last updated: 7/17/2026, 2:55:53 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {

        if (a == e) {
            if (!(c == a && between(d, b, f))) {
                return 1;
            }
        }

        if (b == f) {
            if (!(d == b && between(c, a, e))) {
                return 1;
            }
        }

        if (Math.abs(c - e) == Math.abs(d - f)) {
            int dx = (e - c) > 0 ? 1 : -1;
            int dy = (f - d) > 0 ? 1 : -1;

            int x = c + dx;
            int y = d + dy;
            boolean blocked = false;

            while (x != e && y != f) {
                if (x == a && y == b) {
                    blocked = true;
                    break;
                }
                x += dx;
                y += dy;
            }

            if (!blocked) {
                return 1;
            }
        }

        return 2;
    }

    private boolean between(int x, int a, int b) {
        return (x > Math.min(a, b) && x < Math.max(a, b));
    }
}