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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1=list1;
        ListNode h2=list2;
        
        ListNode nd=new ListNode();
        if(list1==null && list2==null){
            return list1;
        }else if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        
        if(h1.val<=h2.val){
            nd.val=h1.val;
            h1=h1.next;
        }else{
            nd=h2;
            h2=h2.next;
        }
        
        
        ListNode start=nd;
        
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                nd.next=h1;
                nd=nd.next;
                h1=h1.next;
            }else{
                nd.next=h2;
                nd=nd.next;
                h2=h2.next;
            }
        }
        
        while(h1!=null){
            nd.next=h1;
                nd=nd.next;
            h1=h1.next;
        }
        
        while(h2!=null){
            nd.next=h2;
            nd=nd.next;
            h2=h2.next;
        }
        
        nd=null;
        
        return start;
    }
}