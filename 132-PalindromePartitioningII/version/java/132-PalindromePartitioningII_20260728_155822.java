// Last updated: 7/28/2026, 3:58:22 PM
1class Solution {
2    public void reorderList(ListNode head) {
3
4        if (head == null || head.next == null)
5            return;
6
7        // Step 1: Find the middle
8        ListNode slow = head;
9        ListNode fast = head;
10
11        while (fast.next != null && fast.next.next != null) {
12            slow = slow.next;
13            fast = fast.next.next;
14        }
15
16        // Step 2: Reverse the second half
17        ListNode prev = null;
18        ListNode curr = slow.next;
19        slow.next = null;
20
21        while (curr != null) {
22            ListNode next = curr.next;
23            curr.next = prev;
24            prev = curr;
25            curr = next;
26        }
27
28        // Step 3: Merge the two halves
29        ListNode first = head;
30        ListNode second = prev;
31
32        while (second != null) {
33            ListNode temp1 = first.next;
34            ListNode temp2 = second.next;
35
36            first.next = second;
37            second.next = temp1;
38
39            first = temp1;
40            second = temp2;
41        }
42    }
43}