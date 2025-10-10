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
    fun reverseList(head: ListNode?): ListNode? {
        var pre : ListNode? = null
        var cur = head
        var nxt = head?.next
        while(nxt != null){
            cur?.next = pre
            pre = cur
            cur = nxt
            nxt = nxt?.next
        }
        cur?.next = pre
        return cur
    }
}