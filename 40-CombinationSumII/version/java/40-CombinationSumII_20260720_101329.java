// Last updated: 7/20/2026, 10:13:29 AM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        Map<String, List<String>> map = new HashMap<>();
6
7        for (String str : strs) {
8            char[] chars = str.toCharArray();
9            Arrays.sort(chars);
10            String key = new String(chars);
11
12            map.putIfAbsent(key, new ArrayList<>());
13            map.get(key).add(str);
14        }
15
16        return new ArrayList<>(map.values());
17    }
18}