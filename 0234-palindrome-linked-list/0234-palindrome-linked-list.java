/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverseList(ListNode list){
        //reverses the list starting from the node in argument
        ListNode curr=list;
        ListNode prev=null;
        while(curr!=null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    static ListNode findMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        //slow will end up in middle and if there are two middles,
        //it will end up at second middle
        //for palindrome input, we would have two middles
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        //first node
        ListNode start=head;
        //middle node (e.g. for 1,2,2,1-> second 2)
        ListNode mid=findMiddle(head);
        //reverse the list from middle to end (e.g. 1,2,1,2)
        //store the returned start node of this part in mid
        mid=reverseList(mid);
        
        //compare the two parts of linked list
        while(mid!=null){
            if(start.val!=mid.val) return false;
            start=start.next;
            mid=mid.next;
        }
        
        return true;
    }
}