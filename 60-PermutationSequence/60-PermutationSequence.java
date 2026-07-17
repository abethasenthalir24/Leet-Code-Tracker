// Last updated: 7/17/2026, 2:59:04 PM

class Solution {
    public String getPermutation(int n, int k) {
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        int[] fact = new int[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
            numbers.add(i);
        }

        k--;

        StringBuilder ans = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            int index = k / fact[i - 1];
            ans.append(numbers.get(index));
            numbers.remove(index);
            k %= fact[i - 1];
        }

        return ans.toString();
    }
}

