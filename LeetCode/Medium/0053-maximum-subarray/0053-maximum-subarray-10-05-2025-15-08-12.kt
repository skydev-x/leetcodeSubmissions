class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var result = Int.MIN_VALUE
        var curSum = 0
        val n = nums.size - 1
        for(i in 0..n) {
            curSum += nums[i]
            result = maxOf(result,curSum)
            if(curSum <= 0){
                curSum = 0
            }
        }
        return result
    }
}