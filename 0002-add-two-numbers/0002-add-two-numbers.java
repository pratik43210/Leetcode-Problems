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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        int c=0;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+c;
            c=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            int sum=l1.val+c;
            c=sum/10;
            temp.next=new ListNode(sum%10);
            l1=l1.next;
            temp=temp.next;
        }
        
        while(l2!=null){
            int sum=l2.val+c;
            c=sum/10;
            temp.next=new ListNode(sum%10);
            l2=l2.next;
            temp=temp.next;
        }
        
        if(c==1) temp.next=new ListNode(1);
        
        return dummy.next;
    }
}