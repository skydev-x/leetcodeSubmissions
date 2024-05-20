class Solution {
    fun isValid(s: String): Boolean { 
        val stack = Stack<Char>()
        val matchingParentheses = mapOf(
            '}' to '{',
            ']' to '[',
            ')' to '('
        )
        
        for (char in s) {
            if (char in matchingParentheses.values) {
                stack.push(char)
            } else if (char in matchingParentheses.keys) {
                if (stack.isEmpty() || stack.peek() != matchingParentheses[char]) {
                    return false
                }
                stack.pop()
            } else {
                return false
            }
        }
        
        return stack.isEmpty()
    }
}