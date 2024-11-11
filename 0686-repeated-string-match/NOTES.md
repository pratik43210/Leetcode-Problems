**Solution**
​
class Solution {
public int repeatedStringMatch(String a, String b) {
int n=a.length(),m=b.length();
//a should repeat atlest a min number of times so that length
//of a>=length of b
//we can get that by m/n but we might get rounded down value
//if m is not a exact multiple of n
//so we pweform ceiling division by adding n-1, -1 accounts
//for when m is exact multiple of n
int minRepeats=(m+n-1)/n;
// Create a string by repeating 'a' the minimum required number of times
String repeatedA = a.repeat(minRepeats);
// Check if b is a substring of repeatedA
if (repeatedA.contains(b)) return minRepeats;
​
// Repeat a one more time and check again
repeatedA += a;
if (repeatedA.contains(b)) return minRepeats + 1;
​
// If not found, return -1
return -1;
}
}
​
**Explanation**
This code finds the minimum number of times string a must be repeated so that b becomes a substring of the repeated string. If it is impossible, the function returns -1.
​
The function starts by calculating minRepeats, which is the minimum number of times a should be repeated for the repeated string to be at least as long as b. This is done with ceiling division: (m + n - 1) / n, where m is the length of b and n is the length of a. This formula ensures that the length of a repeated minRepeats times will cover the length of b.
​
The function then creates a string repeatedA by repeating a minRepeats times. If b is found within this string, it returns minRepeats as the answer. If not, a is repeated once more and appended to repeatedA to handle cases where b might overlap partially across the end of one repeat and the start of the next. The function checks again if b is now a substring. If found, it returns minRepeats + 1. If b is still not a substring after these checks, the function concludes that b cannot be obtained as a substring of any repeated version of a and returns -1.
​
Time and Space Complexity
The time complexity of this function is O((m+n)⋅m), where m is the length of b and n is the length of a. This is due to the contains check on repeatedA, which can take up to the length of repeatedA. The space complexity O(m+n) because we store repeatedA with up to minRepeats + 1 repetitions of a.