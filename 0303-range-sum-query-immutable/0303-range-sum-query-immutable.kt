class NumArray(nums: IntArray) {

    private val preSum = nums.runningFold(0, Int::plus).toIntArray()

    fun sumRange(left: Int, right: Int): Int =
        preSum[right + 1] - preSum[left]

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */