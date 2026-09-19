// Last updated: 9/19/2026, 9:11:41 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        boolean[] used = new boolean[nums.length];
5
6        backtrack(nums, used, new ArrayList<>(), result);
7
8        return result;
9    }
10
11    void backtrack(int[] nums, boolean[] used, List<Integer> current,
12                   List<List<Integer>> result) {
13
14        if (current.size() == nums.length) {
15            result.add(new ArrayList<>(current));
16            return;
17        }
18
19        for (int i = 0; i < nums.length; i++) {
20            if (used[i]) {
21                continue;
22            }
23
24            used[i] = true;
25            current.add(nums[i]);
26
27            backtrack(nums, used, current, result);
28
29            current.remove(current.size() - 1);
30            used[i] = false;
31        }
32    }
33}