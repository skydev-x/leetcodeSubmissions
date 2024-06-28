class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.isEmpty()) return intervals
        val sortedIntervals = intervals.sortedBy { it[0] }
        val merged = mutableListOf<IntArray>()
        var currentInterval = sortedIntervals[0]
        merged.add(currentInterval)
        for (i in 1 until sortedIntervals.size) {
            val nextInterval = sortedIntervals[i]
            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = maxOf(currentInterval[1], nextInterval[1])
            } else {
                currentInterval = nextInterval
                merged.add(currentInterval)
            }
        }
        return merged.toTypedArray()
    }
}