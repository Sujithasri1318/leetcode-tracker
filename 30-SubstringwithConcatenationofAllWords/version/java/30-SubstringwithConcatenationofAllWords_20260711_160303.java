// Last updated: 7/11/2026, 4:03:03 PM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3
4        List<Integer> result = new ArrayList<>();
5
6        if (s == null || s.length() == 0 || words == null || words.length == 0) {
7            return result;
8        }
9
10        int wordLen = words[0].length();
11        int wordCount = words.length;
12        int totalLen = wordLen * wordCount;
13
14        if (s.length() < totalLen) {
15            return result;
16        }
17
18        // Store frequency of words
19        HashMap<String, Integer> map = new HashMap<>();
20        for (String word : words) {
21            map.put(word, map.getOrDefault(word, 0) + 1);
22        }
23
24        // Try each possible starting offset
25        for (int i = 0; i < wordLen; i++) {
26
27            int left = i;
28            int count = 0;
29
30            HashMap<String, Integer> window = new HashMap<>();
31
32            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
33
34                String word = s.substring(right, right + wordLen);
35
36                if (map.containsKey(word)) {
37
38                    window.put(word, window.getOrDefault(word, 0) + 1);
39                    count++;
40
41                    while (window.get(word) > map.get(word)) {
42                        String leftWord = s.substring(left, left + wordLen);
43                        window.put(leftWord, window.get(leftWord) - 1);
44                        left += wordLen;
45                        count--;
46                    }
47
48                    if (count == wordCount) {
49                        result.add(left);
50
51                        String leftWord = s.substring(left, left + wordLen);
52                        window.put(leftWord, window.get(leftWord) - 1);
53                        left += wordLen;
54                        count--;
55                    }
56
57                } else {
58                    window.clear();
59                    count = 0;
60                    left = right + wordLen;
61                }
62            }
63        }
64
65        return result;
66    }
67}