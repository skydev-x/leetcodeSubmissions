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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var h1 : ListNode? = list1
        var h2 : ListNode? = list2 
        var result  = ListNode(0)
        var t : ListNode? = result
        while(h1 != null && h2 != null){
            if(h1?.`val` ?: 0 < h2?.`val` ?: 0){
                t?.next = h1
                t = t?.next
                h1 = h1?.next
            } else {
                t?.next = h2
                t = t?.next
                h2 = h2?.next
            }
        }

        while(h1 != null){
            t?.next = h1
            t = t?.next
            h1 = h1?.next
        }

        while(h2 != null){
            t?.next = h2
            t = t?.next
            h2 = h2?.next
        }

        return result?.next
    }
}