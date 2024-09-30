Space Complexity: O(n) due to the hash set storing potentially all nodes in the worst case if there is no cycle.
​
**Optimal Solution**
​
public class Solution {
public boolean hasCycle(ListNode head) {
if(head==null || head.next==null) return false;
ListNode fast=head;
ListNode slow=head;
while(fast.next!=null && fast.next.next!=null){
slow=slow.next;
fast=fast.next.next;
if(fast==slow) return true;
}
return false;
}
}
​
**Code Explanation**
The hasCycle function begins by checking if the linked list is empty or has only one node. If either condition is true, it returns false, indicating no cycle.
​
Two pointers, slow and fast, are initialized to the head of the list. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. The function enters a while loop that continues as long as fast can move forward (i.e., it checks that fast.next and fast.next.next are not null). Inside the loop, both pointers advance: slow moves one node ahead, and fast moves two nodes ahead.
​
If at any point the fast pointer meets the slow pointer, it indicates a cycle, and the function returns true. If the loop terminates without a meeting point, it returns false, indicating no cycle exists.
​
Time and Space Complexity
Time Complexity: O(n), where n is the number of nodes in the linked list. In the worst case, both pointers traverse the list completely.
Space Complexity: O(1) since the algorithm uses only a fixed amount of space (two pointers) regardless of the input size.
This approach is efficient and avoids the need for additional data structures, making it a preferred method for cycle detection in linked lists.
​
​
​
​