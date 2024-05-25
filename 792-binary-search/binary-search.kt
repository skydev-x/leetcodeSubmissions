class Solution {
    fun search(nums: IntArray, target: Int): Int {
        if(nums.size == 1){
            return if(nums[0] == target) 0 else -1
        }
        var l = 0
        var r = nums.size - 1
        return binarySearch(nums,l,r,target)
    }

    fun binarySearch(nums : IntArray ,l : Int, r : Int, t : Int) : Int {
        if(l > r){
            return - 1
        }
        val mid = (r - l) / 2 + l 
        return when {
            nums[mid] < t -> {
                binarySearch(nums,mid + 1,r,t)
            }
            nums[mid] > t -> {
                binarySearch(nums,l,mid - 1,t)
            }
            else -> return mid
        }
    }
}