class Solution {
    fun myPow(x: Double, n: Int): Double {
        val N = n.toLong()
        fun pow(x: Double, n: Long) : Double {
            if(n == 0L) return 1.0
            val half = pow(x, n/2)
            return if(n.toInt() % 2 == 0) half * half else x * half * half
        }
        return if(n >= 0) pow(x,N) else 1/pow(x,-N)
    }
}