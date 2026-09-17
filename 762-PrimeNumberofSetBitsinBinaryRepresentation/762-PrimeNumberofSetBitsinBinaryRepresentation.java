// Last updated: 9/17/2026, 10:04:48 AM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int count = 0;
4
5        for (int num = left; num <= right; num++) {
6            int bits = Integer.bitCount(num);
7
8            if (isPrime(bits)) {
9                count++;
10            }
11        }
12
13        return count;
14    }
15
16    private boolean isPrime(int n) {
17        if (n < 2) {
18            return false;
19        }
20
21        for (int i = 2; i * i <= n; i++) {
22            if (n % i == 0) {
23                return false;
24            }
25        }
26
27        return true;
28    }
29}