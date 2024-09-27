class Solution {
public ListNode reverseList(ListNode head) {
ListNode curr=head;
ListNode prev=null;
while(curr!=null){
ListNode front=curr.next;
curr.next=prev;
prev=curr;
curr=front;
}
return prev;
}
}
​
​
The solution reverses a singly linked list by iterating through the list and adjusting the pointers. It starts with two pointers: prev (initially set to null) and curr (pointing to the head). In each iteration, it stores the next node (front), then reverses the direction of the current node by pointing it to prev. The prev pointer is then moved to curr, and curr is advanced to the next node (front). This process continues until curr becomes null, at which point prev holds the new head of the reversed list. The algorithm runs in O(n) time with O(1) space.