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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var h1 : ListNode? = l1
        var h2 : ListNode? = l2
        val result = ListNode(0)
        var t : ListNode? = result
        var carry = 0
        while(h1 != null && h2 != null){
            val sum = (h1?.`val` ?: 0) + (h2?.`val` ?: 0) + carry
            val den = sum % 10
            carry = (sum - den) / 10
            t?.next = ListNode(den)
            t = t?.next
            h1 = h1?.next
            h2 = h2?.next
        }

        while(h1 != null){
            val sum = (h1?.`val` ?: 0) + carry
            val den = sum % 10
            carry = (sum - den) / 10
            t?.next = ListNode(den)
            t = t?.next
            h1 = h1?.next
        }

        while(h2 != null){
            val sum = (h2?.`val` ?: 0) + carry
            val den = sum % 10
            carry = (sum - den) / 10
            t?.next = ListNode(den)
            t = t?.next
            h2 = h2?.next
        }

        if(carry != 0){
            t?.next = ListNode(carry)
        }

        return result.next
    }
}