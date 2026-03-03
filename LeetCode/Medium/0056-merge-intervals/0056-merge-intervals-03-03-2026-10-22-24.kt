class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size <= 1) return intervals
        intervals.sortBy { it[0] }
        val res = mutableListOf<IntArray>()

        var cur = intervals[0]
        for(i in 1 until intervals.size){
            val next = intervals[i]
            // nxt.start <= cur.end ::->> overlaping
            if(next[0] <= cur[1]){ 
                //merge
                cur[1] = maxOf(next[1],cur[1])
            } else {
                res.add(cur)
                cur = next
            }
        }
        res.add(cur)
        return res.toTypedArray()
    }
}