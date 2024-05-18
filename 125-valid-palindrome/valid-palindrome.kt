class Solution {
    fun isPalindrome(s: String): Boolean {
        val trans = s
        .toCharArray()
        .asSequence()
        .filter {
            it.isLetter() || it.isDigit()
        }
        .map {
            it.lowercase()
        }
        .toList()
        print(trans)
        var i = 0
        var j = trans.size - 1
        while(i < j){
            if(trans[i] != trans[j]){
                return false
            }
            i++
            j--
        }
        return true
    }
}