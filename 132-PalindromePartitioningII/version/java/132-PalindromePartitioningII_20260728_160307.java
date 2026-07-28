// Last updated: 7/28/2026, 4:03:07 PM
1class Solution {
2    public ListNode sortList(ListNode head) {
3
4        if (head == null || head.next == null)
5            return head;
6
7        // Find middle
8        ListNode slow = head;
9        ListNode fast = head.next;
10
11        while (fast != null && fast.next != null) {
12            slow = slow.next;
13            fast = fast.next.next;
14        }
15
16        ListNode mid = slow.next;
17        slow.next = null;
18
19        // Sort both halves
20        ListNode left = sortList(head);
21        ListNode right = sortList(mid);
22
23        // Merge sorted halves
24        return merge(left, right);
25    }
26
27    private ListNode merge(ListNode l1, ListNode l2) {
28
29        ListNode dummy = new ListNode(0);
30        ListNode curr = dummy;
31
32        while (l1 != null && l2 != null) {
33
34            if (l1.val <= l2.val) {
35                curr.next = l1;
36                l1 = l1.next;
37            } else {
38                curr.next = l2;
39                l2 = l2.next;
40            }
41
42            curr = curr.next;
43        }
44
45        if (l1 != null)
46            curr.next = l1;
47
48        if (l2 != null)
49            curr.next = l2;
50
51        return dummy.next;
52    }
53}