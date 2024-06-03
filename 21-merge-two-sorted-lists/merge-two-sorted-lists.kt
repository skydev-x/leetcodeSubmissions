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
        var h1 = list1
        var h2 = list2
        val dummy = ListNode(0)
        var temp = dummy

        
        while(h1 != null && h2 != null){
            if(h1.`val` >= h2.`val`){
                temp.next = h2
                h2 = h2.next
            } else {
                temp.next = h1
                h1 = h1.next
            }
            temp = temp.next
        }
        if(h1 != null){
            temp?.next = h1
        }
        if(h2 != null){
            temp?.next = h2
        }
        return dummy.next
    }
}