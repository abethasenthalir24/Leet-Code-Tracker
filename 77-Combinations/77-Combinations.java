// Last updated: 10/1/2026, 9:14:02 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(1, n, k, new ArrayList<>(), result);
5        return result;
6    }
7
8    private void backtrack(int start, int n, int k,
9                           List<Integer> current,
10                           List<List<Integer>> result) {
11
12        if (current.size() == k) {
13            result.add(new ArrayList<>(current));
14            return;
15        }
16
17        for (int i = start; i <= n; i++) {
18            current.add(i);
19
20            backtrack(i + 1, n, k, current, result);
21
22            current.remove(current.size() - 1);
23        }
24    }
25}