// Last updated: 7/23/2026, 10:13:29 AM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7
8        while (head != null) {
9
10            // Duplicate found
11            if (head.next != null && head.val == head.next.val) {
12
13                while (head.next != null && head.val == head.next.val) {
14                    head = head.next;
15                }
16
17                prev.next = head.next;
18            } else {
19                prev = prev.next;
20            }
21
22            head = head.next;
23        }
24
25        return dummy.next;
26    }
27}