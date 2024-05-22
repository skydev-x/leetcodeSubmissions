class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        for(i in tokens){
            if(isNumeric(i)){
                stack.push(i.toInt())
            } else {
                val a = stack.pop()
                if(stack.isEmpty()){
                    return a.toInt()
                }
                val b = stack.pop()
                val c = getResult(b,a,i)
                stack.push(c)
            }
        }

        return stack.peek().toInt()

    }

    fun isNumeric(str: String) = str.toIntOrNull() != null


    fun getResult(a : Int,b : Int,c : String) : Int {
        return when(c) {
            "*" -> a * b
            "/" -> a / b
            "-" -> a - b
            else -> a + b
        }
    }

}