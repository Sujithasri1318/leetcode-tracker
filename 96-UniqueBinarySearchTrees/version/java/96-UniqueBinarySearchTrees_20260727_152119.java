// Last updated: 7/27/2026, 3:21:19 PM
1class Solution {
2
3    TreeNode first = null;
4    TreeNode second = null;
5    TreeNode prev = null;
6
7    public void recoverTree(TreeNode root) {
8        inorder(root);
9
10        int temp = first.val;
11        first.val = second.val;
12        second.val = temp;
13    }
14
15    private void inorder(TreeNode node) {
16        if (node == null) {
17            return;
18        }
19
20        inorder(node.left);
21
22        if (prev != null && prev.val > node.val) {
23            if (first == null) {
24                first = prev;
25            }
26            second = node;
27        }
28
29        prev = node;
30
31        inorder(node.right);
32    }
33}