class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if(intervals.isEmpty()) return intervals
        intervals.sortBy { it[0] }
        val res = mutableListOf<IntArray>()

        for(i in intervals) {
            if(res.isEmpty()){
                res.add(i)
                continue
            }
            val last = res[res.lastIndex]
            when {
                last[1] < i[0] -> { res.add(i) }
                last[1] >= i[0] && last[1] < i[1]  -> { res[res.lastIndex][1] = i[1] }
                else -> continue
            }
        }
        return res.toTypedArray()
    }
}