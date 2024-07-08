class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        return points.sortedBy { point ->
            point[0] * point[0] + point[1] * point[1].toDouble()
        }.take(k).toTypedArray()
    }
}