// Last updated: 7/23/2026, 10:05:39 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean firstRowZero = false;
7        boolean firstColZero = false;
8
9        // Check first row
10        for (int j = 0; j < n; j++) {
11            if (matrix[0][j] == 0) {
12                firstRowZero = true;
13                break;
14            }
15        }
16
17        // Check first column
18        for (int i = 0; i < m; i++) {
19            if (matrix[i][0] == 0) {
20                firstColZero = true;
21                break;
22            }
23        }
24
25        // Mark rows and columns
26        for (int i = 1; i < m; i++) {
27            for (int j = 1; j < n; j++) {
28                if (matrix[i][j] == 0) {
29                    matrix[i][0] = 0;
30                    matrix[0][j] = 0;
31                }
32            }
33        }
34
35        // Set zeroes based on markers
36        for (int i = 1; i < m; i++) {
37            for (int j = 1; j < n; j++) {
38                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
39                    matrix[i][j] = 0;
40                }
41            }
42        }
43
44        // Zero first row if needed
45        if (firstRowZero) {
46            for (int j = 0; j < n; j++) {
47                matrix[0][j] = 0;
48            }
49        }
50
51        // Zero first column if needed
52        if (firstColZero) {
53            for (int i = 0; i < m; i++) {
54                matrix[i][0] = 0;
55            }
56        }
57    }
58}