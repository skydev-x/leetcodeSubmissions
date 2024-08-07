class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        val map = mapOf(
            '2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
            '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz"
        )
        
        val result = mutableListOf<String>()
        
        fun backtrack(index: Int,combination: String = "") {
            if (index == digits.length) {
                result.add(combination.toString())
                return
            }
            
            val letters = map[digits[index]] ?: return
            for (letter in letters) {
                backtrack(index + 1,combination + letter, )
            }
        }
        
        backtrack(0)
        return result
    }
}