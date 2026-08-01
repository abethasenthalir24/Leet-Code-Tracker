// Last updated: 8/1/2026, 7:42:03 AM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode fast = dummy;
7        ListNode slow = dummy;
8
9        for (int i = 0; i <= n; i++) {
10            fast = fast.next;
11        }
12
13        while (fast != null) {
14            fast = fast.next;
15            slow = slow.next;
16        }
17
18        slow.next = slow.next.next;
19
20        return dummy.next;
21    }
22}