// Last updated: 7/20/2026, 10:32:26 AM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> result = new ArrayList<>();
8
9        for (int[] interval : intervals) {
10            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
11                result.add(interval);
12            } else {
13                result.get(result.size() - 1)[1] =
14                    Math.max(result.get(result.size() - 1)[1], interval[1]);
15            }
16        }
17
18        return result.toArray(new int[result.size()][]);
19    }
20}