}
​
**Explanation:**
​
Your solution for finding the length of the longest consecutive sequence in an unsorted array is mostly correct. It works by sorting the array and counting consecutive numbers. However, sorting the array takes O(nlogn), and there’s a more efficient approach that runs in O(n) using a HashSet.
​
**Issues with the current approach:**
Handling duplicates: When the array contains duplicates, it can miscalculate the length of the sequence.
**Time complexity:**
Sorting the array takes O(nlogn), but this problem can be solved in O(n).
Here’s an optimized solution using a HashSet with O(n) time complexity, which handles duplicates and unordered input efficiently:
​
**Optimal Approach**
​
class Solution {
public int longestConsecutive(int[] a) {
int n = a.length;
if (n == 0)
return 0;
​
int longest = 1;
Set<Integer> set = new HashSet<>();
​
// put all the array elements into set
for (int i = 0; i < n; i++) {
set.add(a[i]);
}
​
// Find the longest sequence
for (int it : set) {
// if 'it' is a starting number
if (!set.contains(it - 1)) {
// find consecutive numbers
int cnt = 1;
int x = it;
while (set.contains(x + 1)) {
x = x + 1;
cnt = cnt + 1;
}
longest = Math.max(longest, cnt);
}
}