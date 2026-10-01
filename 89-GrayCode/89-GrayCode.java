// Last updated: 10/1/2026, 10:32:35 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> grayCode(int n) {
5        List<Integer> result = new ArrayList<>();
6
7        int total = 1 << n;
8
9        for (int i = 0; i < total; i++) {
10            result.add(i ^ (i >> 1));
11        }
12
13        return result;
14    }
15}