// Last updated: 9/29/2026, 2:29:15 PM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        HashMap<String, Integer> map = new HashMap<>();
4        List<String> result = new ArrayList<>();
5
6        if(s.length() < 10) {
7            return result;
8        }
9
10        for(int i = 0; i <= s.length() - 10; i++){
11            String sequence = s.substring(i, i + 10);
12            map.put(sequence, map.getOrDefault(sequence, 0) + 1);
13        }
14
15        for(String sequence : map.keySet()){
16            if(map.get(sequence) > 1){
17                result.add(sequence);
18            }
19        }
20        return result;
21    }
22}