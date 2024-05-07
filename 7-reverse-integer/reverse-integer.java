class Solution {
    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        // Check if the reversed value is within the 32-bit signed integer range
        if (reversed >= Integer.MIN_VALUE && reversed <= Integer.MAX_VALUE) {
            return (int) reversed;
        } else {
            return 0;
        }
    }
}