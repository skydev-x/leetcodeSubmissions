class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int,Int>()
        map[0] = 1
        var sum = 0
        var total = 0
        for(i in 0 until nums.size) {
            sum += nums[i]
            total += map.getOrPut(sum -k){0} 
            map[sum] = map.getOrPut(sum){0} + 1
        }

        return total
    }
}