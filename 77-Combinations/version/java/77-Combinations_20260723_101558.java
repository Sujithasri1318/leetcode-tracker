// Last updated: 7/23/2026, 10:15:58 AM
1import java.util.Stack;
2
3class Solution {
4
5    public int maximalRectangle(char[][] matrix) {
6        if (matrix == null || matrix.length == 0) {
7            return 0;
8        }
9
10        int rows = matrix.length;
11        int cols = matrix[0].length;
12        int[] heights = new int[cols];
13        int maxArea = 0;
14
15        for (int i = 0; i < rows; i++) {
16
17            // Build histogram
18            for (int j = 0; j < cols; j++) {
19                if (matrix[i][j] == '1') {
20                    heights[j]++;
21                } else {
22                    heights[j] = 0;
23                }
24            }
25
26            maxArea = Math.max(maxArea, largestRectangleArea(heights));
27        }
28
29        return maxArea;
30    }
31
32    private int largestRectangleArea(int[] heights) {
33        Stack<Integer> stack = new Stack<>();
34        int maxArea = 0;
35        int n = heights.length;
36
37        for (int i = 0; i <= n; i++) {
38            int currHeight = (i == n) ? 0 : heights[i];
39
40            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
41                int height = heights[stack.pop()];
42
43                int width;
44                if (stack.isEmpty()) {
45                    width = i;
46                } else {
47                    width = i - stack.peek() - 1;
48                }
49
50                maxArea = Math.max(maxArea, height * width);
51            }
52
53            stack.push(i);
54        }
55
56        return maxArea;
57    }
58}