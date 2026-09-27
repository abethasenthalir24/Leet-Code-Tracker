// Last updated: 9/27/2026, 7:30:50 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> set = new HashSet<>(wordList);
4
5        if (!set.contains(endWord)) {
6            return 0;
7        }
8
9        Queue<String> queue = new LinkedList<>();
10        queue.offer(beginWord);
11
12        int level = 1;
13
14        while (!queue.isEmpty()) {
15            int size = queue.size();
16
17            for (int k = 0; k < size; k++) {
18                String word = queue.poll();
19
20                if (word.equals(endWord)) {
21                    return level;
22                }
23
24                char[] chars = word.toCharArray();
25
26                for (int i = 0; i < chars.length; i++) {
27                    char original = chars[i];
28
29                    for (char ch = 'a'; ch <= 'z'; ch++) {
30                        chars[i] = ch;
31                        String next = new String(chars);
32
33                        if (set.contains(next)) {
34                            queue.offer(next);
35                            set.remove(next);
36                        }
37                    }
38
39                    chars[i] = original;
40                }
41            }
42
43            level++;
44        }
45
46        return 0;
47    }
48}