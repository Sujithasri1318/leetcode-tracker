// Last updated: 7/28/2026, 3:58:54 PM
1class Solution {
2    public List<Integer> preorderTraversal(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5        preorder(root, result);
6
7        return result;
8    }
9
10    private void preorder(TreeNode node, List<Integer> result) {
11
12        if (node == null)
13            return;
14
15        result.add(node.val);
16        preorder(node.left, result);
17        preorder(node.right, result);
18    }
19}