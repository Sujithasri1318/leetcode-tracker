// Last updated: 7/23/2026, 10:06:13 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int left = 0;
7        int right = m * n - 1;
8
9        while (left <= right) {
10            int mid = left + (right - left) / 2;
11
12            int row = mid / n;
13            int col = mid % n;
14
15            if (matrix[row][col] == target) {
16                return true;
17            } else if (matrix[row][col] < target) {
18                left = mid + 1;
19            } else {
20                right = mid - 1;
21            }
22        }
23
24        return false;
25    }
26}