class MinStack() {

    val list = ArrayDeque<Int>()
    val minList = ArrayDeque<Int>()

    fun push(`val`: Int) {
        list.addLast(`val`)
       if (minList.isEmpty() || `val` <= minList.last()) {
            minList.addLast(`val`)
        } else {
            minList.addLast(minList.last())
        }
    }

    fun pop() {
        list.removeLast()
        minList.removeLast()
    }

    fun top(): Int {
        return list.last()
    }

    fun getMin(): Int {
        return minList.last()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */