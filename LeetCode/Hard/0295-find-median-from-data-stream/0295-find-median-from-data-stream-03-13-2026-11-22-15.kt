class MedianFinder() {

    val smaller = PriorityQueue<Int>(compareByDescending { it }) //max heap
    val larger = PriorityQueue<Int>() //min


    fun addNum(num: Int) {

        if(num > smaller.peek() ?: 0) {
            larger.add(num)
        } else {
            smaller.add(num)
        }

        if(smaller.size - larger.size > 1){
            larger.add(smaller.poll())
        } 
        if(larger.size > smaller.size){
            smaller.add(larger.poll())
        }
    }

    fun findMedian(): Double {
        val total = smaller.size + larger.size
        if(total % 2 == 0) return (smaller.peek().toDouble() + larger.peek().toDouble())/ 2
        return smaller.peek().toDouble()
    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * var obj = MedianFinder()
 * obj.addNum(num)
 * var param_2 = obj.findMedian()
 */