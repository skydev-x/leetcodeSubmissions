class Solution {

        fun maximumSubarraySum(nums: IntArray, k: Int): Long {
        val cur = mutableMapOf<Int,Int>()
        var max = 0L
        var sum = 0L

        for(i in 0 until k){
            cur[nums[i]] = cur.getOrPut(nums[i]){0} + 1
            sum += nums[i].toLong()
        }
        if(cur.keys.size == k){
            max = sum.toLong()
        }
        print("$max")

        for(end in k until nums.size){
            sum += nums[end].toLong() - nums[end-k].toLong()
            cur[nums[end]] = cur.getOrPut(nums[end]){0} + 1
            cur[nums[end - k]] = cur.getValue(nums[end - k]) - 1
            if(cur[nums[end - k]] == 0){
                cur.remove(nums[end - k])
            }
            if(cur.keys.size == k){
                max = maxOf(max,sum)
            }
        }

        return max
    }
}