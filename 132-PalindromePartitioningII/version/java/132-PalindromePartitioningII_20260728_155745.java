// Last updated: 7/28/2026, 3:57:45 PM
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3
4        if (head == null || head.next == null)
5            return null;
6
7        ListNode slow = head;
8        ListNode fast = head;
9
10        // Step 1: Detect if a cycle exists
11        while (fast != null && fast.next != null) {
12
13            slow = slow.next;
14            fast = fast.next.next;
15
16            if (slow == fast) {
17
18                // Step 2: Find the start of the cycle
19                ListNode start = head;
20
21                while (start != slow) {
22                    start = start.next;
23                    slow = slow.next;
24                }
25
26                return start;
27            }
28        }
29
30        return null;
31    }
32}