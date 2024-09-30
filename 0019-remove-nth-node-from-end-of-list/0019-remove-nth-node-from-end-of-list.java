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
    public static int getSize(ListNode head){
        int size=0;
        
        ListNode curr=head;
        
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode t=dummy;
        ListNode curr=dummy;
        int s=getSize(head);
        
        if(s==1){
            return null;
        }
        
        n=s-n+1;
        int count=1;
        
        while(count<=n){
            t=curr;
            curr=curr.next;
            count++;
        }
        
        t.next=curr.next;
        
        return dummy.next;
    }
}