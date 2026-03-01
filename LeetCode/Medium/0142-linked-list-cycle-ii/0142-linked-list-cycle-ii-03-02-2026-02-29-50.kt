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
    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head
        var cur : ListNode? = null
        while(fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
            if(slow == fast) {
                cur = slow
                break
            }
        }
        if(fast == null) return null
        slow = head
        fast = cur
        while(slow != fast){
            slow = slow?.next
            fast = fast?.next
        }
        return slow
    }
}