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
    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        dummy.next=head;
        ListNode prev=null;
        for(int i=0;i<m;i++)
        {
            prev=current;
            current=current.next;
        }
        ListNode prev2=prev;
        ListNode current2=current;
        ListNode temp;
        for(int i=m;i<=n;i++)
        {
            temp=current2.next;
            current2.next=prev2;
            prev2=current2;
            current2=temp;
        }
        prev.next=prev2;
        current.next=current2;
        return dummy.next;
        
    }
}

