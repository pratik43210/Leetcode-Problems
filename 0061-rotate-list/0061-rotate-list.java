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
    static int getSize(ListNode head){
        ListNode temp=head;
        int count=0;
        
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        
        int size=getSize(head);
        k=k%size;
        if(k==0) return head;
        int bi=size-k;
        
        ListNode temp=new ListNode(0);
        temp.next=head;
        
        for(int i=1;i<=bi;i++){
            temp=temp.next;
        }
        
        ListNode newHead=temp.next;
        temp.next=null;
        
        ListNode temp2=newHead;
        
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        
        temp2.next=head;
        
        return newHead;
    }
}