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
    public ListNode swapPairs(ListNode head) {
        ListNode res = head;
        while(head != null && head.next != null)
        {
            int tem = head.val;
            head.val = head.next.val;
            head.next.val = tem;
            
            head = head.next.next;
        }
        return res;
    }
}