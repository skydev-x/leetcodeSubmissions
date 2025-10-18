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
        if(head == null) return null  // Simplified return
        
        // Count nodes
        var count = 0
        var cur = head
        while(cur != null) {
            cur = cur.next
            count++
        }
        
        // Remove first node
        if(count == n) return head.next  // Cleaner
        
        // Find node before target
        var prev = head
        repeat(count - n - 1) {  // More idiomatic than while loop
            prev = prev?.next
        }
        
        // Remove target node
        prev?.next = prev?.next?.next
        
        return head
    }
}