class Solution {
    public int longestValidParentheses(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            }
            if (c == ')') {
                right++;
            }
            if (left == right) {
                count = Math.max(count, left + right);
            }
            if (right > left) {
                left = right = 0;
            }
        }
        left = right = 0;
         for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            }
            if (c == ')') {
                right++;
            }
            if (left == right) {
                count = Math.max(count, left + right);
            }
             if (left > right) {
                left = right = 0;
            }
        }
        return count;
    }
}
