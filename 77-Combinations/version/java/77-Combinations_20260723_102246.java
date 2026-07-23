// Last updated: 7/23/2026, 10:22:46 AM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        if (head == null || left == right) {
5            return head;
6        }
7
8        ListNode dummy = new ListNode(0);
9        dummy.next = head;
10
11        ListNode prev = dummy;
12
13        // Move prev to the node before 'left'
14        for (int i = 1; i < left; i++) {
15            prev = prev.next;
16        }
17
18        ListNode curr = prev.next;
19
20        // Reverse the sublist
21        for (int i = 0; i < right - left; i++) {
22            ListNode next = curr.next;
23            curr.next = next.next;
24            next.next = prev.next;
25            prev.next = next;
26        }
27
28        return dummy.next;
29    }
30}