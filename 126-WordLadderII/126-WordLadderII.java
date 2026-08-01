// Last updated: 8/1/2026, 7:27:29 AM
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> result = new ArrayList<>();
4        int i = 0;
5        int n = intervals.length;
6
7        while (i < n && intervals[i][1] < newInterval[0]) {
8            result.add(intervals[i]);
9            i++;
10        }
11
12        while (i < n && intervals[i][0] <= newInterval[1]) {
13            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
14            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
15            i++;
16        }
17
18        result.add(newInterval);
19
20        while (i < n) {
21            result.add(intervals[i]);
22            i++;
23        }
24
25        return result.toArray(new int[result.size()][]);
26    }
27}