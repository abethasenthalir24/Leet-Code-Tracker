// Last updated: 8/1/2026, 7:56:55 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(candidates);
5        backtrack(candidates, target, 0, new ArrayList<>(), result);
6        return result;
7    }
8
9    private void backtrack(int[] candidates, int target, int start,
10                           List<Integer> path, List<List<Integer>> result) {
11        if (target == 0) {
12            result.add(new ArrayList<>(path));
13            return;
14        }
15
16        for (int i = start; i < candidates.length; i++) {
17            if (i > start && candidates[i] == candidates[i - 1]) continue;
18            if (candidates[i] > target) break;
19
20            path.add(candidates[i]);
21            backtrack(candidates, target - candidates[i], i + 1, path, result);
22            path.remove(path.size() - 1);
23        }
24    }
25}