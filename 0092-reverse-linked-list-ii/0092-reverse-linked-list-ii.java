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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left== right)
        {
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        for(int i=0;cur!=null && i<left-1;i++)
        {
            pre = cur;
            cur = cur.next;
        }
        ListNode last = pre;
        ListNode newE = cur;
        ListNode curn = cur.next; 
        for(int i=0;cur!=null && i<right-left+1;i++)
        {
            cur.next = pre;
            pre = cur;
            cur = curn;
            if(curn!=null)
            {
                curn = curn.next;
            }
        }
        if(last!=null)
        {
            last.next = pre;
        }
        else{
            head = pre;
        }
        newE.next = cur;
        return head;
    }
}