class Solution {
    fun maxArea(height: IntArray): Int {
        var i = 0
        var j = height.size - 1
        var maxWater = -1

        while(i < j){
            val cur = (j- i) * minOf(height[i],height[j])
            maxWater = maxOf(cur,maxWater)
            if(height[i] < height[j]){
                i++
            } else {
                j--
            }
        }

        return maxWater

    }
}