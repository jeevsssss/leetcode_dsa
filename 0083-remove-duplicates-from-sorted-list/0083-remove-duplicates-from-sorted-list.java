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
 public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        Set<Integer>ss=new HashSet<>();
        while(cur!=null)
        {
            if(ss.contains(cur.val))
            {
                prev.next=cur.next;
            }
            else
            {
                ss.add(cur.val);
                prev=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}