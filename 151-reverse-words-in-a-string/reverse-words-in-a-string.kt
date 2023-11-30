class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ").map{
            it.trim()
        }.filter {
            it.isNotEmpty()
        }.reversed().joinToString(" ")
    }
}