// Last updated: 7/20/2026, 3:44:50 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14class Solution {
15    public ListNode rotateRight(ListNode head, int k) {
16
17        if (head == null || head.next == null || k == 0) {
18            return head;
19        }
20
21        // Find length and last node
22        int length = 1;
23        ListNode tail = head;
24
25        while (tail.next != null) {
26            tail = tail.next;
27            length++;
28        }
29
30        // Reduce unnecessary rotations
31        k = k % length;
32
33        if (k == 0) {
34            return head;
35        }
36
37        // Make the list circular
38        tail.next = head;
39
40        // Find new tail
41        int steps = length - k;
42        ListNode newTail = head;
43
44        for (int i = 1; i < steps; i++) {
45            newTail = newTail.next;
46        }
47
48        // New head
49        ListNode newHead = newTail.next;
50
51        // Break the circle
52        newTail.next = null;
53
54        return newHead;
55    }
56}