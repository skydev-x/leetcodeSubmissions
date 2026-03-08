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
        var p : ListNode? = null
        var c = head
        var n = c?.next
        while(n != null){
            c?.next = p
            p = c
            c = n
            n = c?.next
        }
        c?.next = p
        return c
    }
}