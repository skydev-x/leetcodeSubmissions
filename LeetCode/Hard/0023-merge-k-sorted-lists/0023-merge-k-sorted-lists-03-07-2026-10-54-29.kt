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
        val minHeap = PriorityQueue(compareBy<ListNode> { it.`val` })
        // init heap with firsts
        for(l in lists){
            if(l != null){
                minHeap.add(l)
            }
        }
        var dummy = ListNode(0)
        var t = dummy
        while(!minHeap.isEmpty()){
            val cm = minHeap.poll()
            t.next = cm
            t = t.next
            if(cm?.next != null){
                minHeap.add(cm?.next)
            }
        }

        return dummy?.next
    }

}

// merge two lists
//  fun mergeKLists(lists: Array<ListNode?>): ListNode? {
//         if(lists.isEmpty()) return null
//         if(lists.size == 1) return lists[0]

//         var first = mergeTwo(lists[0],lists[1])
//         for(i in 2 until lists.size){
//             val cur = mergeTwo(first,lists[i])
//             first = cur
//         }

//         return first
//     }

//     fun mergeTwo(one : ListNode?, two : ListNode?) : ListNode? {
//         var t1 = one
//         var t2 = two
//         val res = ListNode(0)
//         var t = res
//         while(t1 != null && t2 != null){
//             if(t1?.`val` ?: 0 < t2?.`val` ?: 0){
//                 t.next = t1
//                 t1 = t1?.next
//             } else {
//                 t.next = t2
//                 t2 = t2?.next
             
//             }
//             t = t!!.next
//         }

//         while(t1 != null){
//             t.next = t1
//             t1 = t1?.next
//             t = t!!.next
//         }

//         while(t2 != null){
//             t.next = t2
//             t2 = t2?.next
//             t = t!!.next
//         }

//         return res?.next
    
//     }

// brute force
    // fun mergeKLists(lists: Array<ListNode?>): ListNode? {
    //     val all = mutableListOf<Int>()
    //     for(l in lists){
    //         var cur = l
    //         while(cur != null){
    //             all.add(cur.`val`)
    //             cur = cur?.next
    //         }
    //     }
    //     all.sort()
    //     val head = ListNode(0)
    //     var t = head
    //     for(i in all){
    //         t.next = ListNode(i)
    //         t = t.next
    //     }
    //     return head.next
    // }