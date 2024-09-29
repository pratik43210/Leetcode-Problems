curr.next=list2;
}
return nd.next;
}
}
​
The solution merges two sorted linked lists by iterating through both lists and comparing their values. It uses a dummy node to simplify the merging process, appending the smaller node from either list to the result list and advancing the corresponding pointer. After one list is fully traversed, any remaining nodes from the other list are appended to the merged list. The function returns the merged list, starting from the node after the dummy node. This approach operates in O(n + m) time and O(1) space, where n and m are the lengths of the two lists.
​
**Optimal solution (in place)**
​
class Solution {
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
if(list1==null) return list2;
if(list2==null) return list1;
if(list1.val>list2.val){
ListNode temp=list1;
list1=list2;
list2=temp;
}
ListNode res=list1;
while(list1!=null && list2!=null){
ListNode temp=null;
while(list1!=null && list1.val<=list2.val){
temp=list1;
list1=list1.next;
}
temp.next=list2;
ListNode tmp=list1;
list1=list2;
list2=tmp;
}
return res;
}
}