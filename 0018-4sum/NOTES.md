}
}
}
return ans;
}
}
​
**Key Points of Code:**
**Sorting the Array:**
​
Sorting the input array helps simplify the two-pointer approach for the inner two loops.
**Avoiding Duplicates:**
​
You correctly handle duplicate values for both the first (i) and second (j) loops to ensure that no duplicate quadruplets are included in the result.
**Two-Pointer Approach:**
​
After fixing i and j, you use a two-pointer approach (left and right) to find the other two elements that complete the quadruplet.
Handling Large Sums:
​
You cast the sum to long to avoid integer overflow for large numbers, which is important in cases where nums[i] + nums[j] + nums[left] + nums[right] may exceed the int range.
**Time Complexity:**
Sorting the array takes O(nlogn).
The nested loops with the two-pointer approach result in O(n ^3 ) time complexity overall.
Space Complexity:
The space complexity is O(k), where 𝑘 is the number of quadruplets stored in the result list.
​