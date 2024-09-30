//we will update the value of n to get nth node from last
n=s-n+1;
//in the loop, t wil move by n postions for n-1 iterations as we do t.next in each
//but since t points to dummy which point to one position before head,
//t will point to n-1th position
for(int count=1;count<n;count++){
t=t.next;
}
//we will point the n-1th node to n+1th node
t.next=t.next.next;
return dummy.next;
}
}
​
The provided code efficiently removes the n-th node from the end of a linked list by first calculating the list’s size using the getSize method, which helps in identifying the exact position of the node to be removed. A dummy node is introduced to simplify edge cases, such as removing the first node, and allows for consistent list manipulation. The pointer t starts at the dummy node and moves to the (n-1)-th node, which is the node just before the one to be removed. By adjusting t.next to skip the target node, the node is effectively removed from the list. This approach works for various cases, including when the first or only node needs to be removed, as the dummy node ensures that the list structure remains valid, and dummy.next is returned as the updated head of the list.
​
The time complexity of the solution is O(L), where L is the length of the linked list, as it involves two linear traversals of the list. The space complexity is O(1) since only a few pointers are used, and the list is modified in place without requiring extra space proportional to its size.