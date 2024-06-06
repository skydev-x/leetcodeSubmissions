/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null || head?.next == null){
            return false
        }
        var slow = head
        var fast = head.next
        while(fast != null && fast.next != null){
            if(slow == fast){
                return true
            }
            slow = slow?.next
            fast = fast.next?.next
        }
        return false
    }
}