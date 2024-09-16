do{
slow=nums[slow];
fast=nums[nums[fast]];
}while(slow!=fast);
//we use do while because initially slow=fast and loop will not execute
fast=nums[0];
while(slow!=fast){
slow=nums[slow];
fast=nums[fast];
}
return slow;
}
}
​
The code implements Floyd’s Tortoise and Hare algorithm (Cycle Detection) to find the duplicate number in an array. Here’s a brief summary of how it works:
​
**Explanation of Floyd’s Tortoise and Hare (Cycle Detection):**
Key Idea: The problem can be modeled as finding a cycle in a "linked list" where each element in the array points to another element based on its value. It works here because the numbers are in range 1-n and array is n+1 length so the index range is 0-n. Any given number will always point to a valid index. Cycle forms because every index with non repeated value will point to different integer index. if value is repeated it will point to same index and cycle will repeat after that.
​
Step 1: Detecting the Cycle:
​
The slow pointer moves one step at a time, and the fast pointer moves two steps at a time.
If there's a duplicate number, it creates a cycle in this "linked list" structure, and the slow and fast pointers will eventually meet inside the cycle.
Step 2: Finding the Cycle's Start (Duplicate Number):
​
Once a cycle is detected (i.e., slow == fast), we reset one pointer (fast) to the beginning of the array.
Both pointers now move one step at a time. The point where they meet is the start of the cycle, which corresponds to the duplicate number.