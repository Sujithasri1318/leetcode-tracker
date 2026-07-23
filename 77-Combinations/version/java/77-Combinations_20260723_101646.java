// Last updated: 7/23/2026, 10:16:46 AM
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode smallDummy = new ListNode(0);
4        ListNode largeDummy = new ListNode(0);
5
6        ListNode small = smallDummy;
7        ListNode large = largeDummy;
8
9        while (head != null) {
10            if (head.val < x) {
11                small.next = head;
12                small = small.next;
13            } else {
14                large.next = head;
15                large = large.next;
16            }
17            head = head.next;
18        }
19
20        large.next = null;
21        small.next = largeDummy.next;
22
23        return smallDummy.next;
24    }
25}