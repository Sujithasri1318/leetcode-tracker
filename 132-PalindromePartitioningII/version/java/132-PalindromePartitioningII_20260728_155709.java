// Last updated: 7/28/2026, 3:57:09 PM
1public class Solution {
2    public boolean hasCycle(ListNode head) {
3
4        if (head == null || head.next == null)
5            return false;
6
7        ListNode slow = head;
8        ListNode fast = head;
9
10        while (fast != null && fast.next != null) {
11
12            slow = slow.next;
13            fast = fast.next.next;
14
15            if (slow == fast)
16                return true;
17        }
18
19        return false;
20    }
21}