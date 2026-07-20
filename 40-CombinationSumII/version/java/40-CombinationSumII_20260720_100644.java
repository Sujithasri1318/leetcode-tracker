// Last updated: 7/20/2026, 10:06:44 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        List<List<Integer>> result = new ArrayList<>();
6        Arrays.sort(candidates);
7        backtrack(candidates, target, 0, new ArrayList<>(), result);
8        return result;
9    }
10
11    private void backtrack(int[] candidates, int target, int start,
12                           List<Integer> current, List<List<Integer>> result) {
13
14        if (target == 0) {
15            result.add(new ArrayList<>(current));
16            return;
17        }
18
19        for (int i = start; i < candidates.length; i++) {
20
21            // Skip duplicate elements
22            if (i > start && candidates[i] == candidates[i - 1]) {
23                continue;
24            }
25
26            // No need to continue if current number exceeds target
27            if (candidates[i] > target) {
28                break;
29            }
30
31            current.add(candidates[i]);
32
33            // Move to next index (each number used only once)
34            backtrack(candidates, target - candidates[i], i + 1, current, result);
35
36            // Backtrack
37            current.remove(current.size() - 1);
38        }
39    }
40}