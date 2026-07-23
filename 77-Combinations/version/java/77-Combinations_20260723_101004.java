// Last updated: 7/23/2026, 10:10:04 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combine(int n, int k) {
5        List<List<Integer>> result = new ArrayList<>();
6        backtrack(1, n, k, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(int start, int n, int k,
11                           List<Integer> current,
12                           List<List<Integer>> result) {
13
14        if (current.size() == k) {
15            result.add(new ArrayList<>(current));
16            return;
17        }
18
19        for (int i = start; i <= n; i++) {
20            current.add(i);
21            backtrack(i + 1, n, k, current, result);
22            current.remove(current.size() - 1); // Backtrack
23        }
24    }
25}