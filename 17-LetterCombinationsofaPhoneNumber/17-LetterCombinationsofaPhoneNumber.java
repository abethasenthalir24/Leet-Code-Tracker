// Last updated: 8/1/2026, 7:40:13 AM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> result = new ArrayList<>();
4        if (digits == null || digits.length() == 0) return result;
5
6        String[] map = {
7            "", "", "abc", "def", "ghi", "jkl",
8            "mno", "pqrs", "tuv", "wxyz"
9        };
10
11        backtrack(result, map, digits, 0, new StringBuilder());
12        return result;
13    }
14
15    private void backtrack(List<String> result, String[] map, String digits, int index, StringBuilder sb) {
16        if (index == digits.length()) {
17            result.add(sb.toString());
18            return;
19        }
20
21        String letters = map[digits.charAt(index) - '0'];
22
23        for (char c : letters.toCharArray()) {
24            sb.append(c);
25            backtrack(result, map, digits, index + 1, sb);
26            sb.deleteCharAt(sb.length() - 1);
27        }
28    }
29}