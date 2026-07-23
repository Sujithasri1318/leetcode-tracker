// Last updated: 7/23/2026, 10:04:15 AM
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5        Stack<String> stack = new Stack<>();
6
7        String[] parts = path.split("/");
8
9        for (String part : parts) {
10            if (part.equals("") || part.equals(".")) {
11                continue;
12            } else if (part.equals("..")) {
13                if (!stack.isEmpty()) {
14                    stack.pop();
15                }
16            } else {
17                stack.push(part);
18            }
19        }
20
21        if (stack.isEmpty()) {
22            return "/";
23        }
24
25        StringBuilder result = new StringBuilder();
26
27        for (String dir : stack) {
28            result.append("/").append(dir);
29        }
30
31        return result.toString();
32    }
33}