class Solution {
    public int myAtoi(String s) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            if (result * sign > INT_MAX) {
                return INT_MAX;
            }
            if (result * sign < INT_MIN) {
                return INT_MIN;
            }
            i++;
        }
        result *= sign;
        if (result > INT_MAX) {
            return INT_MAX;
        }
        if (result < INT_MIN) {
            return INT_MIN;
        }
        return (int) result;
    }
}