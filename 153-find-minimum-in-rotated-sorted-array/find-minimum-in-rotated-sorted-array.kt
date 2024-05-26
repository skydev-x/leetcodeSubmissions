class Solution {
    fun findMin(nums: IntArray): Int {
        var ans = Int.MAX_VALUE
        var s = 0
        var e = nums.size - 1
        while(s <= e){
            val mid = (e -s)/2 + s
            if(nums[mid] > nums[e]){
                s = mid + 1
                ans = minOf(nums[e],ans)
            } else {
                e = mid - 1
                ans = minOf(nums[mid],ans)
            } 
        }
        return ans
    }
}