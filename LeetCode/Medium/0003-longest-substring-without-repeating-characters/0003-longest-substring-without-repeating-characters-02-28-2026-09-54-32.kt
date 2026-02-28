class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        var (l,r,res) = Triple(0,0,0) 
        val state = mutableMapOf<Char,Int>()

        while(r < n){
            state[s[r]] = state.getOrDefault(s[r],0) + 1
            while(state.values.any {it > 1}){
                state[s[l]] = state[s[l]]!! - 1
                if(state[s[l]] == 0){
                    state.remove(s[l])
                }
                l++
            }
            res = maxOf(res,r - l + 1)
            r++
        }

        return res
    }
}