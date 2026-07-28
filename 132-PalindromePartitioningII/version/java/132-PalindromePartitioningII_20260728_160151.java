// Last updated: 7/28/2026, 4:01:51 PM
1class Solution {
2    public ListNode insertionSortList(ListNode head) {
3
4        if (head == null || head.next == null)
5            return head;
6
7        ListNode dummy = new ListNode(0);
8        ListNode curr = head;
9
10        while (curr != null) {
11
12            ListNode prev = dummy;
13
14            // Find the correct position to insert
15            while (prev.next != null && prev.next.val < curr.val) {
16                prev = prev.next;
17            }
18
19            ListNode next = curr.next;
20
21            // Insert current node
22            curr.next = prev.next;
23            prev.next = curr;
24
25            curr = next;
26        }
27
28        return dummy.next;
29    }
30}