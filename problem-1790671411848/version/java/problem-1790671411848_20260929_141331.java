// Last updated: 9/29/2026, 2:13:31 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] arr = new String[nums.length];
4
5        for(int i = 0; i < nums.length; i++){
6            arr[i] = String.valueOf(nums[i]);
7        }
8
9        Arrays.sort(arr, (a,b) -> (b + a).compareTo(a + b));
10
11        if(arr[0].equals("0")){
12            return "0";
13        }
14
15        StringBuilder result = new StringBuilder();
16
17        for(String s : arr){
18            result.append(s);
19        }
20
21        return result.toString();
22    }
23}