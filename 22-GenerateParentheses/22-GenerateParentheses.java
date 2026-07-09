// Last updated: 7/9/2026, 10:06:43 AM
class Solution {

    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        backtrack("", 0, 0, n);
        return result;
    }

    public void backtrack(String current, int open, int close, int n) {

        // Base case
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add '(' if possible
        if (open < n) {
            backtrack(current + "(", open + 1, close, n);
        }

        // Add ')' if possible
        if (close < open) {
            backtrack(current + ")", open, close + 1, n);
        }
    }
}