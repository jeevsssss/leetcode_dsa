/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result = new ListNode(0);
        ListNode* ptr=result;
        int carry=0;
        while(l1 !=NULL || l2 !=NULL)
        {
            int sum=0+carry;
            if(l1!=NULL)
            {
                sum=sum+l1->val;
                l1=l1->next;
            }
            if(l2!=NULL)
            {
                sum=sum+l2->val;
                l2=l2->next;
            }
            carry=sum/10;
            ptr->next=new ListNode(sum%10);
            ptr=ptr->next;
        }
        if(carry !=0)
        {
            ptr->next=new ListNode(carry);
        }
        return result->next;
    }
};