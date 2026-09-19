// Last updated: 9/19/2026, 9:04:12 AM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        if (head == null || head.next == null) {
4            return head;
5        }
6
7        ListNode first = head;
8        ListNode second = head.next;
9
10        first.next = swapPairs(second.next);
11        second.next = first;
12
13        return second;
14    }
15}