// Last updated: 7/11/2026, 4:05:15 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5        stack.push(-1);
6
7        int maxLength = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10
11            if (s.charAt(i) == '(') {
12                stack.push(i);
13            } else {
14                stack.pop();
15
16                if (stack.isEmpty()) {
17                    stack.push(i);
18                } else {
19                    maxLength = Math.max(maxLength, i - stack.peek());
20                }
21            }
22        }
23
24        return maxLength;
25    }
26}