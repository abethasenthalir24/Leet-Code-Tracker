// Last updated: 7/17/2026, 2:59:21 PM
class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current) {
        // Found a valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Target exceeded
        if (target < 0) {
            return;
        }

        // Try each candidate starting from 'start'
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // Choose
            backtrack(candidates, target - candidates[i], i, current); // Reuse same element
            current.remove(current.size() - 1); // Backtrack
        }
    }
}