// Last updated: 7/27/2026, 3:20:37 PM
1class Solution {
2
3    public boolean isValidBST(TreeNode root) {
4        return validate(root, null, null);
5    }
6
7    private boolean validate(TreeNode node, Long min, Long max) {
8        if (node == null) {
9            return true;
10        }
11
12        if (min != null && node.val <= min) {
13            return false;
14        }
15
16        if (max != null && node.val >= max) {
17            return false;
18        }
19
20        return validate(node.left, min, (long) node.val) &&
21               validate(node.right, (long) node.val, max);
22    }
23}