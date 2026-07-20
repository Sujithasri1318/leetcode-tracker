// Last updated: 7/20/2026, 10:33:15 AM
1import java.util.*;
2
3class Solution {
4    public int[][] insert(int[][] intervals, int[] newInterval) {
5        List<int[]> result = new ArrayList<>();
6        int i = 0;
7        int n = intervals.length;
8
9        // Step 1: Add intervals before newInterval
10        while (i < n && intervals[i][1] < newInterval[0]) {
11            result.add(intervals[i]);
12            i++;
13        }
14
15        // Step 2: Merge overlapping intervals
16        while (i < n && intervals[i][0] <= newInterval[1]) {
17            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
18            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
19            i++;
20        }
21        result.add(newInterval);
22
23        // Step 3: Add remaining intervals
24        while (i < n) {
25            result.add(intervals[i]);
26            i++;
27        }
28
29        return result.toArray(new int[result.size()][]);
30    }
31}