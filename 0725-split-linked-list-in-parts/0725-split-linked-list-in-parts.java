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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int l =0;
        ListNode temp = head;
        while(temp!=null)
        {
            l++;
            temp=temp.next;
        }
        int part = l/k;
        int ex = l%k;
        ListNode[]  res = new ListNode[k];
        temp = head;
        
        for(int i=0;i<k;i++)
        {
            res[i] = temp;
            int cur  = part + (ex-- > 0 ? 1:0);
            for(int j=0;j<cur-1;j++)
            {
                temp =temp.next;
            }
            if(temp!=null)
            {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }
        return res;
    }
}