class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        var ans = Array(k) { intArrayOf() }
        val pq = PriorityQueue<IntArray>(1, compareBy { getDistanceFromOrigin(it) })
        for (point in points) {
            pq.add(point)
        }
        for(i in 0 until k){
            ans[i] = pq.poll()
        }
        return ans
    }

    private fun getDistanceFromOrigin(intArray: IntArray): Double {
        val x = 0 - intArray[0]
        val y = 0 - intArray[1]
        
        return sqrt(x.toDouble() * x.toDouble() + y.toDouble() * y.toDouble())
    }
}