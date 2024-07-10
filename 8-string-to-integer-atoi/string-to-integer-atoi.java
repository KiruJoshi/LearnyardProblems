class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int i = 0;
        int n = str.length();
        int sign = 1;
        long number = 0;

        // Discard leading whitespaces
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        // Check if the next character is a sign
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits to an integer
        while (i < n && Character.isDigit(str.charAt(i))) {
            number = number * 10 + (str.charAt(i) - '0');

            // Check for overflow
            if (sign * number > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign * number < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * number);
    }
}
