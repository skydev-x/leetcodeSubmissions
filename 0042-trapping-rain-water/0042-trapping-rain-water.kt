class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        if(n <= 2) return 0
        var start = 0
        var total = 0

        while(start < n - 1){
            var end = start + 1
            while (end < n && height[end] < height[start]) {
                end++
            }
            if (end == n) {
                end = start + 1
                for (i in start + 1 until n) {
                    if (height[i] >= height[end]) {
                        end = i
                    }
                }
            }
            val cur = minOf(height[start], height[end])
            var sum = 0
            for (i in start + 1 until end) {
                sum += cur - height[i]
            }

            total += sum
            start = end
        }

        return total
        
    }
}