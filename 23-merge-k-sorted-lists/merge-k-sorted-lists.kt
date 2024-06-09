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
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }

        var interval = 1
        while (interval < lists.size) {
            for (i in 0 until lists.size - interval step interval * 2) {
                lists[i] = merge(lists[i], lists[i + interval])
            }
            interval *= 2
        }

        return lists[0]
    }

    fun merge(h1: ListNode?, h2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var tail = dummy
        var l1 = h1
        var l2 = h2

        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                tail.next = l1
                l1 = l1.next
            } else {
                tail.next = l2
                l2 = l2.next
            }
            tail = tail.next!!
        }

        if (l1 != null) {
            tail.next = l1
        } else {
            tail.next = l2
        }

        return dummy.next
    }
}