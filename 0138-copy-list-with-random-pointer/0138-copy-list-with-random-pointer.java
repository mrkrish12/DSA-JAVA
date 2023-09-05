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
                if(head== null)
            {
            return head;
        }
        
        Node cur = head;
        while(cur!=null)
        {
            Node temp = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = temp;
            cur = temp;
        }
        cur = head;
        while(cur!=null)
        {
            if(cur.next!=null)
            {
                cur.next.random = (cur.random!=null)? cur.random.next:null;
            }
            cur= cur.next.next;
        }
        Node copy = head.next;
        Node temp = copy;
        
        while(temp.next!=null)
        {
            head.next = head.next.next;
            temp.next = temp.next.next;
            head = head.next;
        temp = temp.next;
        }
        head.next=null;
        return copy;
    }
}