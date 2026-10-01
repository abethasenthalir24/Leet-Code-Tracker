// Last updated: 10/1/2026, 9:08:53 AM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5        boolean[] used = new boolean[nums.length];
6
7        backtrack(nums, used, new ArrayList<>(), result);
8
9        return result;
10    }
11
12    private void backtrack(int[] nums, boolean[] used,
13                           List<Integer> current,
14                           List<List<Integer>> result) {
15
16        if (current.size() == nums.length) {
17            result.add(new ArrayList<>(current));
18            return;
19        }
20
21        for (int i = 0; i < nums.length; i++) {
22
23            if (used[i]) {
24                continue;
25            }
26
27            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
28                continue;
29            }
30
31            used[i] = true;
32            current.add(nums[i]);
33
34            backtrack(nums, used, current, result);
35
36            current.remove(current.size() - 1);
37            used[i] = false;
38        }
39    }
40}