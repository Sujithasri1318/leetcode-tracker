// Last updated: 7/28/2026, 4:09:06 PM
1class MinStack {
2
3    Stack<Integer> stack;
4    Stack<Integer> minStack;
5
6    public MinStack() {
7        stack = new Stack<>();
8        minStack = new Stack<>();
9    }
10
11    public void push(int val) {
12
13        stack.push(val);
14
15        if (minStack.isEmpty() || val <= minStack.peek()) {
16            minStack.push(val);
17        }
18    }
19
20    public void pop() {
21
22        if (stack.peek().equals(minStack.peek())) {
23            minStack.pop();
24        }
25
26        stack.pop();
27    }
28
29    public int top() {
30
31        return stack.peek();
32    }
33
34    public int getMin() {
35
36        return minStack.peek();
37    }
38}