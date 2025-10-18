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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        
        int size =0;
        ListNode* temp = head;
        while(temp){
            size++;
            temp = temp->next;
        }
        
        if(size==1){
            return NULL;
        }
        
        if(size==n){
            ListNode* temp2 = head;
            head = head->next;
            delete temp2;
            temp2 = NULL;
            return head;
        }
    
        temp = head;
        int i=0;
        while(i<size-n-1){
            temp=temp->next;
            i++;
        }

        ListNode* to_delete = temp->next;
        if(temp->next){
            temp->next = to_delete->next;
        }
        
        
        delete to_delete;
        to_delete = NULL;
        
        
        return head;
        
    }
};