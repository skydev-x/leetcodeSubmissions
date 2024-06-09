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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        
        // check whether there is more than k nodes 
        var temp = head
        for (i in 0 until k) {
            // if there are less than k nodes, return head (no need to reverse node)
            if (temp == null) return head else temp = temp.next
        }

        // newNextStart is the starting node(after which reversion has taken place)
        val newNextStart = reverseKGroup(temp, k) 
        
        // reverse k nodes one by one 
        var prev: ListNode? = null 
        var curr: ListNode? = head 
        for (i in 0 until k) {
            var next = curr!!.next 
            curr.next = prev
            
            prev = curr
            curr = next
        }
        
        // link starting node(head) with the new next starting node(newNextStart)
        head!!.next = newNextStart
        
        return prev
    }
}