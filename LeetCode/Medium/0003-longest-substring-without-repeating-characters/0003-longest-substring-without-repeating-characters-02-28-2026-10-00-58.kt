class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val seen = mutableSetOf<Char>()
        var max = 0
        var cur = 0
        var start = 0
        var end = 0
        while(end < s.length){
            if(s[end] in seen){
                start++
                end = start
                cur = 1
                seen.clear()

            } else {
                cur++
            }
            seen.add(s[end])
            end++
            max = maxOf(max,cur)

        }
        return max
    }
}