// Last updated: 7/28/2026, 3:52:02 PM
1import java.util.*;
2
3class Solution {
4
5    private Map<Node, Node> map = new HashMap<>();
6
7    public Node cloneGraph(Node node) {
8
9        if (node == null)
10            return null;
11
12        if (map.containsKey(node))
13            return map.get(node);
14
15        Node clone = new Node(node.val);
16        map.put(node, clone);
17
18        for (Node neighbor : node.neighbors) {
19            clone.neighbors.add(cloneGraph(neighbor));
20        }
21
22        return clone;
23    }
24}