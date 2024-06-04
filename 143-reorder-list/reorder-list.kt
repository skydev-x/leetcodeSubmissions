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
    fun reorderList(head: ListNode?): Unit {
        if (head == null || head.next == null) return
        
        // Find the middle of the list
        var slow = head
        var fast = head
        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }
        
        // Reverse the second half of the list
        var second = slow?.next
        slow?.next = null
        second = reverse(second)
        
        // Merge the two halves
        var first = head
        while (second != null) {
            val tmp1 = first?.next
            val tmp2 = second.next
            
            first?.next = second
            second.next = tmp1
            
            first = tmp1
            second = tmp2
        }
    }
    
    fun reverse(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
    
    fun printList(head: ListNode?) {
        var curr = head
        while (curr != null) {
            print("${curr.`val`} -> ")
            curr = curr.next
        }
        println("null")
    }
}