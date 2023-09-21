class Solution {
    fun isPalindrome(s: String): Boolean {
        val filtered = s.filter {
            it.isLetterOrDigit()
        }.toLowerCase()

        var i = 0
        var j = filtered.length - 1
        while(i < j){
            if(filtered[i] != filtered[j]){
                return false
            }
            i++
            j--
        }
        return true
    }
}