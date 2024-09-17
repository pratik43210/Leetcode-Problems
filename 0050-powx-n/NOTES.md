class Solution {
public double myPow(double x, int n) {
double ans = 1.0;
long nn = n;
if (nn < 0) nn = -1 * nn;
while (nn > 0) {
if (nn % 2 == 1) {
ans = ans * x;
nn = nn - 1;
} else {
x = x * x;
nn = nn / 2;
}
}
if (n < 0) ans = (double)(1.0) / (double)(ans);
return ans;
}
}
This code implements the function myPow, which calculates x raised to the power of n efficiently using a method called Exponentiation by Squaring.
​
**Problem Definition**
Given two numbers, x (a double) and n (an integer), the task is to compute x raised to the power of n . The function must handle both positive and negative values of n efficiently.
​
**Approach: Exponentiation by Squaring**
The key idea of Exponentiation by Squaring is that powers of numbers can be broken down into smaller subproblems, which helps reduce the time complexity from O(n) to O(log n).
​
whenever the remainig power (nn) is even we sqare the number and change power to power/2 (nn/2). thus eliminating a lot of iterations.
​
**Time and Space Complexity**
Time Complexity: O(log n) — Each iteration halves nn, leading to logarithmic time complexity.
​
Space Complexity: O(1) — The algorithm uses constant extra space, only a few variables are needed.
​