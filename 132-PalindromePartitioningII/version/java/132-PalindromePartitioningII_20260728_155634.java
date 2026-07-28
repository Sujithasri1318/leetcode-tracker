// Last updated: 7/28/2026, 3:56:34 PM
1import java.util.*;
2
3class Solution {
4
5    public List<String> wordBreak(String s, List<String> wordDict) {
6
7        Set<String> dict = new HashSet<>(wordDict);
8        Map<String, List<String>> memo = new HashMap<>();
9
10        return dfs(s, dict, memo);
11    }
12
13    private List<String> dfs(String s, Set<String> dict,
14                             Map<String, List<String>> memo) {
15
16        if (memo.containsKey(s))
17            return memo.get(s);
18
19        List<String> result = new ArrayList<>();
20
21        if (s.length() == 0) {
22            result.add("");
23            return result;
24        }
25
26        for (String word : dict) {
27
28            if (s.startsWith(word)) {
29
30                List<String> subList = dfs(s.substring(word.length()), dict, memo);
31
32                for (String sub : subList) {
33
34                    if (sub.isEmpty())
35                        result.add(word);
36                    else
37                        result.add(word + " " + sub);
38                }
39            }
40        }
41
42        memo.put(s, result);
43        return result;
44    }
45}