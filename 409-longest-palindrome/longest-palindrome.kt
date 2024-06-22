class Solution {
    fun longestPalindrome(s: String): Int {
       val count = mutableMapOf<Char,Int>()
       for(c in s){
          count[c] = count.getOrPut(c){0} + 1
       }
    var length = 0
    var oddFound = false
    
    for (value in count.values) {
        if (value % 2 == 0) {
            length += value
        } else {
            length += value - 1
            oddFound = true
        }
    }
    
    // Add one if there's any odd count to place in the center
    if (oddFound) {
        length += 1
    }
    
    return length
    }
}