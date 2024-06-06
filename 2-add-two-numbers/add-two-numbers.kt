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
        var carry = 0
        var res = ListNode(0)
        var ans = res
        var t1 = l1
        var t2 = l2
        while(t1 != null || t2 != null){
             val cur = (t1?.`val` ?: 0) + (t2?.`val` ?: 0) + carry
             carry = (cur / 10).toInt()
             if(cur < 10){
                ans.next = ListNode(cur)
             } else {
                ans.next = ListNode(cur%10)
             }
            ans = ans.next 
            if (t1 != null) t1 = t1.next
            if (t2 != null) t2 = t2.next
        }

        if(carry > 0){
            ans.next = ListNode(carry)
        }


        return res.next
    }
}