class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var start = 0
        var end = numbers.size - 1
        while(start < end){
            if(numbers[start] + numbers[end] == target){
                return intArrayOf(start+1,end+1)
            } else if(numbers[start] + numbers[end] < target){
                start++
            } else 
                end--
        }
        return intArrayOf(0,0)
    }
}