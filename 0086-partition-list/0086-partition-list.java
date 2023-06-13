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
    public ListNode partition(ListNode head, int x) {
        ListNode cur=head;
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode p1=dummy1;
        ListNode p2=dummy2;
        while(cur!=null)
        {
            if(cur.val<x)
            {
                p1.next=cur;
                p1=cur;
            }
            else
            {
                p2.next=cur;
                p2=cur;
            }
            cur=cur.next;
        }
        p2.next=null;
        p1.next=dummy2.next;
        head=dummy1.next;
        return head;
    }
}