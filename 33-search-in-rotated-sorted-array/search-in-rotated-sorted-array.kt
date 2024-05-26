class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var s = 0
        var e = nums.size - 1

        while(s <= e){
            val mid = (e - s)/2 + s
            if(nums[mid] == target) return mid
            // modified
            //left sorted
            if(nums[s] <= nums[mid]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1
                } else {
                    s = mid + 1
                }
            //right sorted
            } else {
                if(target > nums[mid] && target <= nums[e]){
                    s = mid + 1
                } else {
                    e = mid - 1
                }
            }
        }
        return -1
    }
}