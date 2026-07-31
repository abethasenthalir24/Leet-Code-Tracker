// Last updated: 7/31/2026, 9:01:08 AM
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3
4        ListNode a = headA;
5        ListNode b = headB;
6
7        while (a != b) {
8            a = (a == null) ? headB : a.next;
9            b = (b == null) ? headA : b.next;
10        }
11
12        return a;
13    }
14}