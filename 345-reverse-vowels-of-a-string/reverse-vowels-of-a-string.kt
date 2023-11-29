class Solution {
    fun reverseVowels(s: String): String {
        var start = 0 
        var end = s.length - 1
        val sa = s.toCharArray()
        while(start < end){
            when{
                s[start].isVowel() && s[end].isVowel() -> {
                    val temp = sa[start]
                    sa[start] = sa[end]
                    sa[end] = temp 
                    start++
                    end--
                }
                s[start].isVowel()  -> {
                    end--
                }
                s[end].isVowel() -> {
                    start++
                }
                else -> {
                    start++
                    end--
                }

            }
        }

        return sa.joinToString("")
    }

    fun Char.isVowel() : Boolean {
        val v = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        return v.contains(this)
    } 
}