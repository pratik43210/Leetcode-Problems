**Solution**
​
class Solution {
public int myAtoi(String s) {
// Define the limits for 32-bit signed integer
int INT_MAX = Integer.MAX_VALUE;
int INT_MIN = Integer.MIN_VALUE;
​
// Trim leading and trailing whitespace
s = s.trim();
​
// Check if string is empty after trimming
if (s.isEmpty()) return 0;
​
int sign = 1;
int i = 0;
​
// Check for leading sign
if (s.charAt(i) == '-') {
sign = -1;
i++;
} else if (s.charAt(i) == '+') {
i++;
}
​
// Skip leading zeros
while (i < s.length() && s.charAt(i) == '0') {
i++;
}
​
int num = 0;
​
// Process the digits
while (i < s.length() && Character.isDigit(s.charAt(i))) {
int digit = s.charAt(i) - '0';
​
// Check for overflow/underflow before adding the digit
if (num > (INT_MAX - digit) / 10) {
return sign == 1 ? INT_MAX : INT_MIN;
}
​
num = num * 10 + digit;
i++;
}
​
return num * sign;
}
}
​
**Explanation**
​
This code defines a myAtoi method to convert a string s into an integer, following specific rules such as handling whitespace, signs, and potential overflows. First, the input string is trimmed of leading and trailing whitespace. If the string becomes empty after trimming, it returns 0. The method then checks the first character to determine the sign. If it is a -, the sign is set to -1; if it is a +, no sign change occurs, and the loop moves forward. The index i is incremented accordingly to skip past any sign.
​
Next, the method skips any leading zeros in the string by advancing i until a non-zero digit is found. It then starts processing the digits of the string, converting each character to its numeric value. Before updating the result, it checks for overflow or underflow by ensuring that the current number does not exceed the 32-bit signed integer limits. If an overflow would occur, the method returns the appropriate limit value (Integer.MAX_VALUE or Integer.MIN_VALUE). The number is built by multiplying the current value by 10 and adding the digit. Finally, the result is returned, with the sign applied.
​
The time complexity of this method is O(n), where n is the length of the input string, as the string is processed once. The space complexity is O(1) because only a fixed amount of extra space is used, regardless of the input size.