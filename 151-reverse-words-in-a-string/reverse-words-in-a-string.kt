class Solution {
    fun reverseWords(s: String): String {
        val words = s.split(" ").filter {
            it.isNotEmpty()
        }
        var i = words.size  - 1
        var result = mutableListOf<String>()
        while(i >= 0){
            result.add(words[i].trim())
            i--
        }
        return result.joinToString(" ").trim()
    }
}