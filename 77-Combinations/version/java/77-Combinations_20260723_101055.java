// Last updated: 7/23/2026, 10:10:55 AM
1class Solution {
2
3    public boolean exist(char[][] board, String word) {
4        int m = board.length;
5        int n = board[0].length;
6
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                if (dfs(board, word, i, j, 0)) {
10                    return true;
11                }
12            }
13        }
14
15        return false;
16    }
17
18    private boolean dfs(char[][] board, String word, int row, int col, int index) {
19
20        // All characters matched
21        if (index == word.length()) {
22            return true;
23        }
24
25        // Boundary or mismatch check
26        if (row < 0 || row >= board.length ||
27            col < 0 || col >= board[0].length ||
28            board[row][col] != word.charAt(index)) {
29            return false;
30        }
31
32        // Mark current cell as visited
33        char temp = board[row][col];
34        board[row][col] = '#';
35
36        // Explore 4 directions
37        boolean found =
38                dfs(board, word, row + 1, col, index + 1) ||
39                dfs(board, word, row - 1, col, index + 1) ||
40                dfs(board, word, row, col + 1, index + 1) ||
41                dfs(board, word, row, col - 1, index + 1);
42
43        // Backtrack
44        board[row][col] = temp;
45
46        return found;
47    }
48}