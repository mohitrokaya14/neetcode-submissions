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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode *nxt;

        if(list1&&(!list2)){
            return list1;
        }else if(list2&&(!list1)){
            return list2;
        }else if(!list1&&!list2){
            return list1;
        }

        ListNode *head=list1;

        if(list1->val>list2->val){
            head = list1;
            list1 = list2;
            list2 = head;
            head = list1;
        }

        ListNode *prev=list1;

        while(list1&&list2){
            if(list1->val<=list2->val){
                prev = list1;
                list1 = list1->next;
            }else{
                nxt = list2->next;
                prev->next=list2;
                prev = list2;
                list2->next=list1;
                list2=nxt;
            }
        }
        if(list2){prev->next=list2;}
        return head;
    }
};
