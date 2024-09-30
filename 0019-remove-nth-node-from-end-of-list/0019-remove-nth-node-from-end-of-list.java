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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        //we will return dummy.next in the end
        dummy.next=head;
        //we point another node t to dummy and use this to iterate over the linked list
        ListNode f=dummy;
        ListNode s=dummy;
        
        for(int i=1;i<=n;i++){
            f=f.next;
        }
        
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        
        s.next=s.next.next;
        
        return dummy.next;
    }
}