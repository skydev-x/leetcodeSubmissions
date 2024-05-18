class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        if(nums.isEmpty()){
            return 0
        }

        val numset = mutableSetOf<Int>()
        val result = mutableMapOf<Int,MutableList<Int>>()

        for(n in nums){
            numset.add(n)
        }

        for(n in nums){
            if(!numset.contains(n-1)){
                result[n] = mutableListOf<Int>(n)
            }
        }

        for(seq in result){
            var cur = seq.key
            while(numset.contains(cur + 1)){
                result[seq.key]!!.add(cur+1)
                cur++
            }
        }

        return result.maxBy { it.value.size }.value.size
    }
}