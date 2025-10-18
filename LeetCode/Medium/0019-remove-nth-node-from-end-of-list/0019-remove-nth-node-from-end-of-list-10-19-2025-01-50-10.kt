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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if(head == null) return head
        var prev : ListNode? = null
        var cur : ListNode? = head
        var count = 0
        while(cur != null){
            cur = cur.next
            count++
        }
        //if it is first node
        if(count == n) {
            val newHead = head?.next
            return newHead
        }
        // take steps
        var fwd = count - n - 1
        prev = head
        while(fwd > 0){
            fwd--
            prev = prev?.next
        }
        //remove nth from end
        prev?.next = prev?.next?.next

        return head
    }
}