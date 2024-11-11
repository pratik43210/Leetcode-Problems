class Solution {
    public int myAtoi(String s) {
        // Define the limits for 32-bit signed integer
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        // Trim leading and trailing whitespace
        s = s.trim();

        // Check if string is empty after trimming
        if (s.isEmpty()) return 0;

        int sign = 1;
        int i = 0;

        // Check for leading sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Skip leading zeros
        while (i < s.length() && s.charAt(i) == '0') {
            i++;
        }

        int num = 0;

        // Process the digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow/underflow before adding the digit
            if (num > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}