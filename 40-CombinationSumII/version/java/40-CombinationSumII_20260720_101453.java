// Last updated: 7/20/2026, 10:14:53 AM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> solveNQueens(int n) {
5        List<List<String>> result = new ArrayList<>();
6
7        char[][] board = new char[n][n];
8        for (int i = 0; i < n; i++) {
9            Arrays.fill(board[i], '.');
10        }
11
12        boolean[] cols = new boolean[n];
13        boolean[] diag1 = new boolean[2 * n - 1];
14        boolean[] diag2 = new boolean[2 * n - 1];
15
16        backtrack(0, n, board, cols, diag1, diag2, result);
17
18        return result;
19    }
20
21    private void backtrack(int row, int n,
22                           char[][] board,
23                           boolean[] cols,
24                           boolean[] diag1,
25                           boolean[] diag2,
26                           List<List<String>> result) {
27
28        if (row == n) {
29            List<String> solution = new ArrayList<>();
30            for (int i = 0; i < n; i++) {
31                solution.add(new String(board[i]));
32            }
33            result.add(solution);
34            return;
35        }
36
37        for (int col = 0; col < n; col++) {
38
39            int d1 = row - col + n - 1;
40            int d2 = row + col;
41
42            if (cols[col] || diag1[d1] || diag2[d2]) {
43                continue;
44            }
45
46            board[row][col] = 'Q';
47            cols[col] = true;
48            diag1[d1] = true;
49            diag2[d2] = true;
50
51            backtrack(row + 1, n, board, cols, diag1, diag2, result);
52
53            board[row][col] = '.';
54            cols[col] = false;
55            diag1[d1] = false;
56            diag2[d2] = false;
57        }
58    }
59}