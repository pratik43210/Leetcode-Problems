/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node temp=head;
        
        //link copy node in between the node
        while(temp!=null){
            Node newNode=new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        
        temp=head;
        
        //link random to the copy nodes
        while(temp!=null){
            Node copyNode=temp.next;
            if(temp.random!=null) copyNode.random=temp.random.next;
            else copyNode.random=null;
            temp=temp.next.next;
        }
        
        //make a dummy node
        Node dNode=new Node(-1);
        //make a node to iterate from dummy node
        Node res=dNode;
        temp=head;
        
        while(temp!=null){
            //point res.next to copy node
            res.next=temp.next;
            //fix the original linked list pointing it to next of next
            temp.next=temp.next.next;
            //move temp and res to next node
            temp=temp.next;
            res=res.next;
        }
        
        return dNode.next;
    }
}