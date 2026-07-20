// Last updated: 7/20/2026, 10:15:41 AM
1class Solution {
2    private int count = 0;
3
4    public int totalNQueens(int n) {
5        boolean[] cols = new boolean[n];
6        boolean[] diag1 = new boolean[2 * n - 1];
7        boolean[] diag2 = new boolean[2 * n - 1];
8
9        backtrack(0, n, cols, diag1, diag2);
10        return count;
11    }
12
13    private void backtrack(int row, int n,
14                           boolean[] cols,
15                           boolean[] diag1,
16                           boolean[] diag2) {
17
18        if (row == n) {
19            count++;
20            return;
21        }
22
23        for (int col = 0; col < n; col++) {
24
25            int d1 = row - col + n - 1;
26            int d2 = row + col;
27
28            if (cols[col] || diag1[d1] || diag2[d2]) {
29                continue;
30            }
31
32            cols[col] = true;
33            diag1[d1] = true;
34            diag2[d2] = true;
35
36            backtrack(row + 1, n, cols, diag1, diag2);
37
38            cols[col] = false;
39            diag1[d1] = false;
40            diag2[d2] = false;
41        }
42    }
43}