class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        if(nums.size <= 1){
            return nums[0].toDouble()
        }
        var l = 0
        var r = k - 1
        var window = 0
        for(i in 0 until k){
            window += nums[i]
        }
        var res = window
        while(r < nums.size -1){
            l++
            r++
            window = window - nums[l-1] + nums[r]
            res = maxOf(res,window)
        }

        return res.toDouble()/k
    }
}