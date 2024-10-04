**Brute Force Approach**
​
class Solution {
public Node copyRandomList(Node head) {
Node temp=head;
HashMap<Node,Node> map=new HashMap<>();
while(temp!=null){
Node newNode=new Node(temp.val);
map.put(temp,newNode);
temp=temp.next;
}
temp=head;
while(temp!=null){
Node copyNode=map.get(temp);
copyNode.next=map.get(temp.next);
copyNode.random=map.get(temp.random);
temp=temp.next;
}
return map.get(head);
}
}
​
The solution to the problem of copying a linked list with random pointers is structured in two main phases, both of which leverage a HashMap to store mappings between the original nodes and their corresponding deep copies.
​
**Phase 1: Creating Node Copies**
In the first pass through the list, the function iterates over each node of the original linked list using the temp pointer. For each node, it creates a new node with the same value, but without setting the next and random pointers yet. It stores each original node as a key in the HashMap, and the newly created copy as the value. This step ensures that for every node in the original list, there is a corresponding deep copy ready to have its pointers set. The time complexity of this step is O(n), where n is the number of nodes in the original list, since it goes through the list once.
​
**Phase 2: Assigning next and random Pointers**
In the second pass, the function again traverses the original list, this time setting up the next and random pointers for each copied node. For every node in the original list, the corresponding copy (retrieved from the HashMap) is updated by setting its next pointer to the deep copy of the original node’s next pointer (also retrieved from the HashMap), and similarly, setting its random pointer to the deep copy of the original node’s random pointer. This step also takes O(n) time, as each node is processed once again.
​
**Time Complexity**
Since both passes through the list each take linear time (O(n)), the overall time complexity of the solution is O(n), where n is the number of nodes in the original list. The use of the HashMap ensures that both the lookups and assignments are efficient (constant time).
​
**Space Complexity**
The space complexity of this solution is O(n) as well, due to the use of the HashMap.