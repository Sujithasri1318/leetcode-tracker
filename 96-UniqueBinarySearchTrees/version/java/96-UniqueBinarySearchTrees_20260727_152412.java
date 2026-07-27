// Last updated: 7/27/2026, 3:24:12 PM
1class Solution {
2
3    public boolean isSymmetric(TreeNode root) {
4        return isMirror(root.left, root.right);
5    }
6
7    private boolean isMirror(TreeNode left, TreeNode right) {
8
9        if (left == null && right == null) {
10            return true;
11        }
12
13        if (left == null || right == null) {
14            return false;
15        }
16
17        if (left.val != right.val) {
18            return false;
19        }
20
21        return isMirror(left.left, right.right) &&
22               isMirror(left.right, right.left);
23    }
24}