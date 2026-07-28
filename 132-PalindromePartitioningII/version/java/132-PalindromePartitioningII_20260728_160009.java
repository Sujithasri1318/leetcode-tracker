// Last updated: 7/28/2026, 4:00:09 PM
1class Solution {
2    public List<Integer> postorderTraversal(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5        postorder(root, result);
6
7        return result;
8    }
9
10    private void postorder(TreeNode node, List<Integer> result) {
11
12        if (node == null)
13            return;
14
15        postorder(node.left, result);
16        postorder(node.right, result);
17        result.add(node.val);
18    }
19}