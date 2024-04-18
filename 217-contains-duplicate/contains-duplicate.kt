class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val result = mutableSetOf<Int>()
        for(i in nums) {
            if(result.contains(i)){
                return true
            } else {
                result.add(i)
            }
        }
        return false
    }
}