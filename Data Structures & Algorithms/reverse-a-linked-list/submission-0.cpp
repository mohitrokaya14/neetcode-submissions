class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *prev = nullptr;
        ListNode *curr = head;
        ListNode *next = nullptr;

        while(curr != nullptr) {
            next = curr->next;   // save next node
            curr->next = prev;   // reverse pointer
            prev = curr;         // move prev forward
            curr = next;         // move curr forward
        }

        return prev;  // prev is new head
    }
};
