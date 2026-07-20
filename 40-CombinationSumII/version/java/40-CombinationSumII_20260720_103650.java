// Last updated: 7/20/2026, 10:36:50 AM
1import java.util.*;
2
3class Solution {
4    public String getPermutation(int n, int k) {
5        List<Integer> numbers = new ArrayList<>();
6        int factorial = 1;
7
8        for (int i = 1; i < n; i++) {
9            factorial *= i;
10        }
11
12        for (int i = 1; i <= n; i++) {
13            numbers.add(i);
14        }
15
16        k--; // Convert to 0-based index
17
18        StringBuilder result = new StringBuilder();
19
20        while (!numbers.isEmpty()) {
21            int index = k / factorial;
22            result.append(numbers.get(index));
23            numbers.remove(index);
24
25            if (numbers.isEmpty()) {
26                break;
27            }
28
29            k %= factorial;
30            factorial /= numbers.size();
31        }
32
33        return result.toString();
34    }
35}