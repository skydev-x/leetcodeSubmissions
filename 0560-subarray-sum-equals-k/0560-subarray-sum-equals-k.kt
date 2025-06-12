class Solution {
    // fun subarraySum(nums: IntArray, k: Int): Int {
    //     val map = mutableMapOf<Int,Int>()
    //     map[0] = 1
    //     var sum = 0
    //     var total = 0
    //     for(i in 0 until nums.size) {
    //         sum += nums[i]
    //         total += map.getOrPut(sum -k){0} 
    //         map[sum] = map.getOrPut(sum){0} + 1
    //     }

    //     return total
    // }
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int,Int>()
        val pre = nums.runningFold(0,Int::plus).toIntArray()
        var total = 0
        for(i in 0 until pre.size) {

            if(map.contains(pre[i] - k)){
                total += map[pre[i] - k]!!
            } 
            map[pre[i]] = map.getOrPut(pre[i]){0} + 1 
        }

        return total
    }
}