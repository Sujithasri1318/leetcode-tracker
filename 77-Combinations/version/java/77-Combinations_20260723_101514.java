// Last updated: 7/23/2026, 10:15:14 AM
1import java.util.Stack;
2
3class Solution {
4    public int largestRectangleArea(int[] heights) {
5        Stack<Integer> stack = new Stack<>();
6        int maxArea = 0;
7        int n = heights.length;
8
9        for (int i = 0; i <= n; i++) {
10            int currentHeight = (i == n) ? 0 : heights[i];
11
12            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
13                int height = heights[stack.pop()];
14
15                int width;
16                if (stack.isEmpty()) {
17                    width = i;
18                } else {
19                    width = i - stack.peek() - 1;
20                }
21
22                maxArea = Math.max(maxArea, height * width);
23            }
24
25            stack.push(i);
26        }
27
28        return maxArea;
29    }
30}