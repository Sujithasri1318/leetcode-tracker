// Last updated: 7/20/2026, 10:17:31 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> result = new ArrayList<>();
6
7        int top = 0;
8        int bottom = matrix.length - 1;
9        int left = 0;
10        int right = matrix[0].length - 1;
11
12        while (top <= bottom && left <= right) {
13
14            // Traverse left to right
15            for (int j = left; j <= right; j++) {
16                result.add(matrix[top][j]);
17            }
18            top++;
19
20            // Traverse top to bottom
21            for (int i = top; i <= bottom; i++) {
22                result.add(matrix[i][right]);
23            }
24            right--;
25
26            // Traverse right to left
27            if (top <= bottom) {
28                for (int j = right; j >= left; j--) {
29                    result.add(matrix[bottom][j]);
30                }
31                bottom--;
32            }
33
34            // Traverse bottom to top
35            if (left <= right) {
36                for (int i = bottom; i >= top; i--) {
37                    result.add(matrix[i][left]);
38                }
39                left++;
40            }
41        }
42
43        return result;
44    }
45}