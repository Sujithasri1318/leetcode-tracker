// Last updated: 7/28/2026, 4:01:10 PM
1class LRUCache {
2
3    class Node {
4        int key, value;
5        Node prev, next;
6
7        Node(int key, int value) {
8            this.key = key;
9            this.value = value;
10        }
11    }
12
13    private int capacity;
14    private Map<Integer, Node> map;
15    private Node head, tail;
16
17    public LRUCache(int capacity) {
18        this.capacity = capacity;
19        map = new HashMap<>();
20
21        head = new Node(0, 0);
22        tail = new Node(0, 0);
23
24        head.next = tail;
25        tail.prev = head;
26    }
27
28    public int get(int key) {
29
30        if (!map.containsKey(key))
31            return -1;
32
33        Node node = map.get(key);
34        remove(node);
35        insert(node);
36
37        return node.value;
38    }
39
40    public void put(int key, int value) {
41
42        if (map.containsKey(key)) {
43            remove(map.get(key));
44        }
45
46        Node node = new Node(key, value);
47        insert(node);
48        map.put(key, node);
49
50        if (map.size() > capacity) {
51            Node lru = tail.prev;
52            remove(lru);
53            map.remove(lru.key);
54        }
55    }
56
57    private void remove(Node node) {
58        node.prev.next = node.next;
59        node.next.prev = node.prev;
60    }
61
62    private void insert(Node node) {
63        node.next = head.next;
64        node.prev = head;
65
66        head.next.prev = node;
67        head.next = node;
68    }
69}