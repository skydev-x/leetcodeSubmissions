class Solution {
    fun isPalindrome(s: String): Boolean {
    val filtered = s.filter { it.isLetterOrDigit() }.toLowerCase()
    return filtered
        .zip(filtered.reversed())
        .all { it.first == it.second }
    }
}