// Last updated: 7/17/2026, 2:55:48 PM
import java.util.*;

class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int[] mavireltho = nums;

        return Math.max(solve(nums, k, true), solve(nums, k, false));
    }

    private long solve(int[] nums, int k, boolean multiply) {
        long NEG = Long.MIN_VALUE / 4;

        long dp0 = NEG;
        long dp1 = NEG;
        long dp2 = NEG;
        long ans = NEG;

        for (int x : nums) {
            long val = x;

            long mod;
            if (multiply) {
                mod = (long) x * k;
            } else {
                mod = x >= 0 ? x / k : -((-x) / k);
            }

            long ndp0 = Math.max(val, dp0 + val);

            long ndp1 = Math.max(
                    mod,
                    Math.max(dp0 + mod, dp1 + mod)
            );

            long ndp2 = Math.max(
                    dp1 + val,
                    dp2 + val
            );

            dp0 = ndp0;
            dp1 = ndp1;
            dp2 = ndp2;

            ans = Math.max(ans, Math.max(dp1, dp2));
        }

        return ans;
    }
}