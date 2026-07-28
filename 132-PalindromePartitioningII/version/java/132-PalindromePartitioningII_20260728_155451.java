// Last updated: 7/28/2026, 3:54:51 PM
1import java.util.*;
2
3class Solution {
4    public Node copyRandomList(Node head) {
5
6        if (head == null)
7            return null;
8
9        Map<Node, Node> map = new HashMap<>();
10
11        Node curr = head;
12
13        // Create copy of each node
14        while (curr != null) {
15            map.put(curr, new Node(curr.val));
16            curr = curr.next;
17        }
18
19        curr = head;
20
21        // Set next and random pointers
22        while (curr != null) {
23            map.get(curr).next = map.get(curr.next);
24            map.get(curr).random = map.get(curr.random);
25            curr = curr.next;
26        }
27
28        return map.get(head);
29    }
30}