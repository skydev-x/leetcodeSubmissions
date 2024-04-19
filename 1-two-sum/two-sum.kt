class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            if(seen.contains(target - nums[i])){
                return intArrayOf(seen[target - nums[i]]!!,i)
            } else {
                seen[nums[i]] = i
            }
        }
        return intArrayOf()
    }
}