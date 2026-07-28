// Last updated: 7/28/2026, 4:05:18 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        for (String token : tokens) {
7
8            if (token.equals("+")) {
9                int b = stack.pop();
10                int a = stack.pop();
11                stack.push(a + b);
12
13            } else if (token.equals("-")) {
14                int b = stack.pop();
15                int a = stack.pop();
16                stack.push(a - b);
17
18            } else if (token.equals("*")) {
19                int b = stack.pop();
20                int a = stack.pop();
21                stack.push(a * b);
22
23            } else if (token.equals("/")) {
24                int b = stack.pop();
25                int a = stack.pop();
26                stack.push(a / b);
27
28            } else {
29                stack.push(Integer.parseInt(token));
30            }
31        }
32
33        return stack.pop();
34    }
35}