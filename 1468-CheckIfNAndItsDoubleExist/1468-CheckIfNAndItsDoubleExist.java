// Last updated: 7/17/2026, 2:56:09 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}