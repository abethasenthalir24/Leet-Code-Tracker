// Last updated: 7/17/2026, 2:55:46 PM
import java.util.*;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        long ans = 0;
        int n = nums.length;

        for (int i = 0; i < k; i++) {
            long num = nums[n - 1 - i];

            long weight = (i < mul) ? (mul - i) : 1;

            ans += num * weight;
        }

        return ans;
    }
}