// Last updated: 7/28/2026, 4:04:21 PM
1import java.util.*;
2
3class Solution {
4    public int maxPoints(int[][] points) {
5
6        int n = points.length;
7
8        if (n <= 2)
9            return n;
10
11        int max = 0;
12
13        for (int i = 0; i < n; i++) {
14
15            Map<String, Integer> map = new HashMap<>();
16            int overlap = 0;
17            int currMax = 0;
18
19            for (int j = i + 1; j < n; j++) {
20
21                int dx = points[j][0] - points[i][0];
22                int dy = points[j][1] - points[i][1];
23
24                if (dx == 0 && dy == 0) {
25                    overlap++;
26                    continue;
27                }
28
29                int gcd = gcd(dx, dy);
30
31                dx /= gcd;
32                dy /= gcd;
33
34                // Normalize sign
35                if (dx < 0) {
36                    dx = -dx;
37                    dy = -dy;
38                } else if (dx == 0) {
39                    dy = 1;
40                } else if (dy == 0) {
41                    dx = 1;
42                }
43
44                String key = dx + "/" + dy;
45
46                map.put(key, map.getOrDefault(key, 0) + 1);
47
48                currMax = Math.max(currMax, map.get(key));
49            }
50
51            max = Math.max(max, currMax + overlap + 1);
52        }
53
54        return max;
55    }
56
57    private int gcd(int a, int b) {
58        if (b == 0)
59            return Math.abs(a);
60        return gcd(b, a % b);
61    }
62}