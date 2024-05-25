class Solution {
    fun search(nums: IntArray, target: Int): Int {
        if(nums.size == 1){
            return if(nums[0] == target) 0 else -1
        }
        var l = 0
        var r = nums.size - 1
        while(l <= r){
            val mid = (r - l) / 2 + l 
            when {
                nums[mid] < target -> {
                    l = mid + 1
                }
                nums[mid] > target -> {
                    r = mid - 1
                }
                else -> return mid
            }
        }

        return -1
    }
}