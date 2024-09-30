**Using HashSet**
public class Solution {
public boolean hasCycle(ListNode head) {
HashSet<ListNode> st=new HashSet<>();
while(head!=null){
if(st.contains(head)) return true;
st.add(head);
head=head.next;
}
return false;
}
}
​
The hasCycle function detects if a linked list contains a cycle by using a hash set to track visited nodes. It iterates through the linked list, checking if the current node is already in the set. If it finds a node that has been seen before, it returns true, indicating a cycle. If the end of the list is reached (i.e., the node becomes null), the function returns false, indicating no cycle exists.
​
Time and Space Complexity
Time Complexity: O(n), where n is the number of nodes in the linked list, since each node is visited once.
Space Complexity: O(n) due to the hash set storing potentially all nodes in the worst case if there is no cycle.
​
​