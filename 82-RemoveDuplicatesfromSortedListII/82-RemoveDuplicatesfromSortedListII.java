// Last updated: 10/1/2026, 9:22:19 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7        ListNode cur = head;
8
9        while (cur != null) {
10            if (cur.next != null && cur.val == cur.next.val) {
11                int duplicate = cur.val;
12
13                while (cur != null && cur.val == duplicate) {
14                    cur = cur.next;
15                }
16
17                prev.next = cur;
18            } else {
19                prev = cur;
20                cur = cur.next;
21            }
22        }
23
24        return dummy.next;
25    }
26}