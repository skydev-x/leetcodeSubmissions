class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val res = IntArray(n-k+1)
        val dq = ArrayDeque<Int>()
        var resIndex = 0

        for(i in nums.indices){

            if(dq.isNotEmpty() && dq.first() < i - k + 1){
                dq.removeFirst()
            }

            while(dq.isNotEmpty() && nums[dq.last()] < nums[i]){
                dq.removeLast()
            }

            dq.addLast(i)

            if(i >= k - 1){
                res[resIndex++] = nums[dq.first()]
            }
            
        }

        return res
    }
}