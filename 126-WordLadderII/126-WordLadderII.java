// Last updated: 8/1/2026, 7:16:42 AM
1class Solution {
2    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
3        List<List<String>> res = new ArrayList<>();
4        Set<String> dict = new HashSet<>(wordList);
5        if (!dict.contains(endWord)) return res;
6
7        Map<String, List<String>> parents = new HashMap<>();
8        Map<String, Integer> level = new HashMap<>();
9        Queue<String> q = new LinkedList<>();
10
11        q.offer(beginWord);
12        level.put(beginWord, 0);
13
14        int len = beginWord.length();
15
16        while (!q.isEmpty()) {
17            String word = q.poll();
18            int currLevel = level.get(word);
19            char[] arr = word.toCharArray();
20
21            for (int i = 0; i < len; i++) {
22                char old = arr[i];
23                for (char c = 'a'; c <= 'z'; c++) {
24                    arr[i] = c;
25                    String next = new String(arr);
26
27                    if (!dict.contains(next)) continue;
28
29                    if (!level.containsKey(next)) {
30                        level.put(next, currLevel + 1);
31                        q.offer(next);
32                        parents.put(next, new ArrayList<>());
33                        parents.get(next).add(word);
34                    } else if (level.get(next) == currLevel + 1) {
35                        parents.get(next).add(word);
36                    }
37                }
38                arr[i] = old;
39            }
40        }
41
42        if (!level.containsKey(endWord)) return res;
43
44        LinkedList<String> path = new LinkedList<>();
45        dfs(endWord, beginWord, parents, path, res);
46        return res;
47    }
48
49    private void dfs(String word, String beginWord, Map<String, List<String>> parents,
50                     LinkedList<String> path, List<List<String>> res) {
51        path.addFirst(word);
52
53        if (word.equals(beginWord)) {
54            res.add(new ArrayList<>(path));
55        } else {
56            List<String> prevs = parents.get(word);
57            if (prevs != null) {
58                for (String prev : prevs) {
59                    dfs(prev, beginWord, parents, path, res);
60                }
61            }
62        }
63
64        path.removeFirst();
65    }
66}