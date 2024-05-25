class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val smallerLeft = previousSmallerElement(heights)
        val smallerRight = nextSmallerElement(heights)
        var maxArea = 0

        for(i in heights.indices){
            val area = (smallerRight[i] - smallerLeft[i] - 1) * heights[i]
            maxArea = maxOf(area,maxArea)
        }

        return maxArea

    }

   fun nextSmallerElement(list: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val result = IntArray(list.size) { list.size }

        for (i in list.size - 1 downTo 0) {
            while (stack.isNotEmpty() && list[stack.last()] >= list[i]) {
                stack.removeLast()
            }

            if (stack.isNotEmpty()) {
                result[i] = stack.last()
            }

            stack.addLast(i)
        }
        return result
    }

    fun previousSmallerElement(list: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val result = IntArray(list.size) { -1 }

        for (i in list.indices) {
            while (stack.isNotEmpty() && list[stack.last()] >= list[i]) {
                stack.removeLast()
            }

            if (stack.isNotEmpty()) {
                result[i] = stack.last()
            }

            stack.addLast(i)
        }
        return result
    }


}