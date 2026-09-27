// Last updated: 9/27/2026, 7:11:59 PM
1class Solution {
2    public String reverseParentheses(String s) {
3        Stack<StringBuilder> stack = new Stack<>();
4        StringBuilder current = new StringBuilder();
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                stack.push(current);
9                current = new StringBuilder();
10            } 
11            else if (ch == ')') {
12                current.reverse();
13                current = stack.pop().append(current);
14            } 
15            else {
16                current.append(ch);
17            }
18        }
19
20        return current.toString();
21    }
22}