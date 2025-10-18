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
        if(list1 == null && list2 == null) return null
        if(list1 == null) return list2
        if(list2 == null) return list1
        
        var t1 = list1
        var t2 = list2

        var result : ListNode? = null

        if(t1!!.`val` < t2!!.`val`) {
                result = t1
                t1 = t1.next
                result.next = mergeTwoLists(t1,t2)
        } else {
                result = t2
                t2 = t2.next
                result.next = mergeTwoLists(t1,t2)
        }

 

        if(t1 == null) {
            result.next = t2
        }

        if(t2 == null) {
            result.next = t1
        }

        return result

    }
}