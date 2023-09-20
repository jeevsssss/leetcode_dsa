/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode currentA = headA;
        while (currentA != null)
        {
            set.add(currentA);
            currentA = currentA.next;
        }
        ListNode currentB = headB;
        while (currentB != null) {
            if (set.contains(currentB))
            {
                return currentB;
            }
            currentB = currentB.next;
        }
        
        return null;
    }
}
