// Last updated: 7/17/2026, 2:59:50 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        java.util.HashSet<Character> set = new java.util.HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}