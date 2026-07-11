// Last updated: 7/11/2026, 4:13:49 PM
1class Solution {
2
3    public void solveSudoku(char[][] board) {
4        solve(board);
5    }
6
7    private boolean solve(char[][] board) {
8
9        for (int row = 0; row < 9; row++) {
10            for (int col = 0; col < 9; col++) {
11
12                if (board[row][col] == '.') {
13
14                    for (char num = '1'; num <= '9'; num++) {
15
16                        if (isValid(board, row, col, num)) {
17
18                            board[row][col] = num;
19
20                            if (solve(board)) {
21                                return true;
22                            }
23
24                            board[row][col] = '.';
25                        }
26                    }
27
28                    return false;
29                }
30            }
31        }
32
33        return true;
34    }
35
36    private boolean isValid(char[][] board, int row, int col, char num) {
37
38        for (int i = 0; i < 9; i++) {
39
40            // Check row
41            if (board[row][i] == num) {
42                return false;
43            }
44
45            // Check column
46            if (board[i][col] == num) {
47                return false;
48            }
49
50            // Check 3x3 box
51            int r = 3 * (row / 3) + i / 3;
52            int c = 3 * (col / 3) + i % 3;
53
54            if (board[r][c] == num) {
55                return false;
56            }
57        }
58
59        return true;
60    }
61}