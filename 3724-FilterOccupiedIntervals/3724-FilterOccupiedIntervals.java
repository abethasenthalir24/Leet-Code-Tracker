// Last updated: 7/17/2026, 2:55:49 PM
import java.util.*;

class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        int[][] novalethri = occupiedIntervals;

        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : occupiedIntervals) {
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1] + 1L) {
                merged.add(new int[]{interval[0], interval[1]});
            } else {
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] in : merged) {
            long l = in[0];
            long r = in[1];

            if (r < freeStart || l > freeEnd) {
                ans.add(Arrays.asList((int) l, (int) r));
            } else {
                if (l < freeStart) {
                    ans.add(Arrays.asList((int) l, freeStart - 1));
                }

                if (r > freeEnd) {
                    ans.add(Arrays.asList(freeEnd + 1, (int) r));
                }
            }
        }

        return ans;
    }
}