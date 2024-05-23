class Solution {

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val cars = position.zip(speed).sortedByDescending { it.first }
        val stk = Stack<Double>()

        for ((pos, spd) in cars) {
            val time = (target - pos).toDouble() / spd
            if (stk.isNotEmpty() && time <= stk.peek()) {
                continue
            } else {
                stk.push(time)
            }
        }

        return stk.size
    }
    
}