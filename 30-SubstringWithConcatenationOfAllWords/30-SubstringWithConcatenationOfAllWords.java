// Last updated: 7/17/2026, 2:59:29 PM
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        int sLen = s.length();

        // Count the frequency of each word in the given words array
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // Since words have length 'wordLen', we run 'wordLen' scans to cover all offsets
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> currentFreq = new HashMap<>();
            int count = 0; // Tracks how many valid words we have in the current window

            // Slide the window across the string
            while (right + wordLen <= sLen) {
                // Extract the next word from the right side of the window
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordFreq.containsKey(word)) {
                    currentFreq.put(word, currentFreq.getOrDefault(word, 0) + 1);
                    count++;

                    // If a word's count exceeds its expected count, shrink the window from the left
                    while (currentFreq.get(word) > wordFreq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentFreq.put(leftWord, currentFreq.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    
                    if (count == wordCount) {
                        result.add(left);
                    }
                } else {
               
                    currentFreq.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}