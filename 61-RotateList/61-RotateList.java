// Last updated: 9/27/2026, 7:05:41 PM
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0) {
4            return head;
5        }
6
7        int length = 1;
8        ListNode tail = head;
9
10        while (tail.next != null) {
11            tail = tail.next;
12            length++;
13        }
14
15        k = k % length;
16
17        if (k == 0) {
18            return head;
19        }
20
21        tail.next = head;
22
23        int steps = length - k;
24        ListNode newTail = tail;
25
26        for (int i = 0; i < steps; i++) {
27            newTail = newTail.next;
28        }
29
30        ListNode newHead = newTail.next;
31        newTail.next = null;
32
33        return newHead;
34    }
35}