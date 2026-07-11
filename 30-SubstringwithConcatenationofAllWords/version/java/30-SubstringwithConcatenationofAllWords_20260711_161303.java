// Last updated: 7/11/2026, 4:13:03 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4        HashSet<String> set = new HashSet<>();
5
6        for (int i = 0; i < 9; i++) {
7            for (int j = 0; j < 9; j++) {
8
9                char num = board[i][j];
10
11                if (num != '.') {
12
13                    if (!set.add(num + " in row " + i) ||
14                        !set.add(num + " in col " + j) ||
15                        !set.add(num + " in box " + (i / 3) + "-" + (j / 3))) {
16                        return false;
17                    }
18                }
19            }
20        }
21
22        return true;
23    }
24}