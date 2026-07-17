// Last updated: 7/17/2026, 2:48:33 PM
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    private Map<String, Boolean> memo = new HashMap<>();
6
7    public boolean isScramble(String s1, String s2) {
8        if (s1.equals(s2)) return true;
9
10        String key = s1 + "#" + s2;
11        if (memo.containsKey(key)) {
12            return memo.get(key);
13        }
14
15        
16        int[] count = new int[26];
17        for (int i = 0; i < s1.length(); i++) {
18            count[s1.charAt(i) - 'a']++;
19            count[s2.charAt(i) - 'a']--;
20        }
21
22        for (int c : count) {
23            if (c != 0) {
24                memo.put(key, false);
25                return false;
26            }
27        }
28
29        int n = s1.length();
30
31        for (int i = 1; i < n; i++) {
32
33            if (isScramble(s1.substring(0, i), s2.substring(0, i)) &&
34                isScramble(s1.substring(i), s2.substring(i))) {
35                memo.put(key, true);
36                return true;
37            }
38
39      
40            if (isScramble(s1.substring(0, i), s2.substring(n - i)) &&
41                isScramble(s1.substring(i), s2.substring(0, n - i))) {
42                memo.put(key, true);
43                return true;
44            }
45        }
46
47        memo.put(key, false);
48        return false;
49    }
50}