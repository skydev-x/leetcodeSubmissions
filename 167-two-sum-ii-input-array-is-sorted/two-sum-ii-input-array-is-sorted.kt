class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0 
        var j = numbers.size - 1
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                return intArrayOf(i+1,j+1)
            } else if (numbers[i] + numbers[j] < target){
                i++
            } else {
                j--
            }

        }
        return intArrayOf(i,j)
    }
}