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
    ListNode* reverseList(ListNode* head) {
        ListNode *prev,*curr=nullptr,*nxt;
        while(head){
            prev = curr;
            curr = head;
            nxt = head->next;

            head->next=prev;
            head=nxt;
        }
        return curr;
    }
};
