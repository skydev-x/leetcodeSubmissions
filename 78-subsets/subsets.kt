class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        util(0,nums,result)
        return result
    }

    fun util(
        i : Int,
        nums : IntArray,
        result : MutableList<List<Int>>,
        cur : MutableList<Int> = mutableListOf()
        ) {
        if(i >= nums.size){
            result.add(cur.toList())
            return
        }
        cur.add(nums[i])
        util(i+1,nums,result,cur)
        cur.remove(nums[i])
        util(i+1,nums,result,cur)
        
    }

}