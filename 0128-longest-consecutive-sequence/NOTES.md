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
return longest;
}
}
​
**Key Steps:**
**Insert Elements into a Set:**
You first insert all the elements from the array into a HashSet to eliminate duplicates and allow for O(1) lookups.
**Identifying Starting Points:**
For each element in the set, you check if it is the start of a sequence by ensuring that it - 1 is not present in the set.
**Counting Consecutive Numbers:**
If the current number is the start of a sequence, you incrementally check for the next consecutive numbers (i.e., it + 1, it + 2, etc.) and count how many consecutive numbers exist.
**Updating the Longest Sequence:**
After finding the length of a consecutive sequence, you update the longest variable if this sequence is the longest one encountered so far.
**Time Complexity:**
Inserting into the HashSet: Takes O(n) time.
Iterating and Checking Consecutive Numbers: Each number is processed at most twice (once when checking for the start of a sequence and again when traversing a sequence), so this part also takes O(n) time.
Thus, the overall time complexity is O(n).