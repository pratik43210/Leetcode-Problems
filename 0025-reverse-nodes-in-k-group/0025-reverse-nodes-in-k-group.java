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
        //points to current node
        ListNode curr=list;
        //points to previous node (in the beginning null)
        ListNode prev=null;
        
        while(curr!=null){
            //store the node next to curr
            ListNode front=curr.next;
            //point curr to previous node
            curr.next=prev;
            //update prev to curr
            prev=curr;
            //move curr to front
            curr=front;
        }
        return prev;
    }
    static ListNode findKthNode(ListNode temp, int k){
        //to get to kth node, we have to move by k-1 steps
        k--;
        //loop till k=0 or temp=null in which case group won't be formed
        while(temp!=null && k!=0){
            temp=temp.next;
            k--;
        }
        //return kth node
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        //store head in temp node for iteration
        ListNode temp=head;
        //create a prevLast node to keep track of last
        //node of previous group
        ListNode prevLast=null;
        //loop till temp=null
        while(temp!=null){
            //find kth node from current node
            ListNode kthNode=findKthNode(temp,k);
            //if kth node is null, means group couldn't form
            if(kthNode==null){
                //if there was a previous group,
                //point its last node to temp
                if(prevLast!=null){
                    prevLast.next=temp;
                }
                //break the loop here as it no group remain
                break;
            }
            //store the next of kthNode
            ListNode nextNode=kthNode.next;
            //point the next of kth node to null
            kthNode.next=null;
            //this will reverse from temp to kth node
            //as kthNode.next is null
            reverseList(temp);
            //after reversal, kth node becomes first of group
            //if it is the first group, head should be kth node
            if(temp==head){
                head=kthNode;
            }else{
                //else point the last node in prev group to it
                prevLast.next=kthNode;
            }
            //after reversal temp becomes last of current group
            //we update the prevLast node accordingly
            prevLast=temp;
            //move to the next group
            temp=nextNode;
        }
        //return head
        return head;
    }
}