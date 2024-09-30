**BruteForce (O(mxn) TC)**
public class Solution {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
while(headB!=null){
ListNode temp=headA;
while(temp!=null){
if(temp==headB) return headB;
temp=temp.next;
}
headB=headB.next;
}
return null;
}
}
​
**Better Approach using hasing O(n+m) TC and O(n) SC**
​
​