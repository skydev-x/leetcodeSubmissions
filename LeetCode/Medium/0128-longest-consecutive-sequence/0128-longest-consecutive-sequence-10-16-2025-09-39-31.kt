class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size <= 1) return nums.size
        nums.sort()
        var cur = 1
        var max = 1
        var last = nums[0]
        for(i in 1 until nums.size){
            if(nums[i] == last + 1){
                cur++
                max = maxOf(max,cur)
            } else if(nums[i] == last){
                continue
            }
            else {
                cur = 1
            }
            last = nums[i]
        }
        return max
    }
}