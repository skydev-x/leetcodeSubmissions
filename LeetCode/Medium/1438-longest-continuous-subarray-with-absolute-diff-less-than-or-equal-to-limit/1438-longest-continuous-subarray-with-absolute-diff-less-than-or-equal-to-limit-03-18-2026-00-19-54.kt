class Solution {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        
        val n = nums.size
        var max = 0
        var l = 0
        var r = 0
        val minD = ArrayDeque<Int>()
        val maxD = ArrayDeque<Int>()

        while(l <= r && r < n){

            while(maxD.isNotEmpty() && nums[r] > maxD.last()){
                maxD.removeLast()
            }

            while(minD.isNotEmpty() && nums[r] < minD.last()){
                minD.removeLast()
            }

            maxD.add(nums[r])
            minD.add(nums[r])

            while(maxD.first() - minD.first() > limit){
                if (maxD.first() == nums[l]) maxD.removeFirst()
                if (minD.first() == nums[l]) minD.removeFirst()
                l++
            } 
            max = maxOf(max,r-l+1)
            r++
        }
        return max
    }
}