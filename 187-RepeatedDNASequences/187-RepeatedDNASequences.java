// Last updated: 9/17/2026, 10:31:35 AM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        Map<String, Integer> map = new HashMap<>();
4        Set<String> result = new HashSet<>();
5
6        for (int i = 0; i <= s.length() - 10; i++) {
7            String sub = s.substring(i, i + 10);
8
9            map.put(sub, map.getOrDefault(sub, 0) + 1);
10
11            if (map.get(sub) == 2) {
12                result.add(sub);
13            }
14        }
15
16        return new ArrayList<>(result);
17    }
18}