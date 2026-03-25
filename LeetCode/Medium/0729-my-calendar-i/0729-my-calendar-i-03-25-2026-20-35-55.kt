class MyCalendar() {

    private val bookings = mutableListOf<IntArray>()

    fun book(startTime: Int, endTime: Int): Boolean {
        if(bookings.isEmpty()) {
            bookings.add(intArrayOf(startTime,endTime))
            return true
        }
        for(booking in bookings){
            val (s,e) = booking
            if(endTime > s && startTime < e) {
                return false 
            } 
        }
        bookings.add(intArrayOf(startTime,endTime))
        return true
    }

}

// e <= startTime || s >= endTime --- De morgan's law ---> 
/**
 * Your MyCalendar object will be instantiated and called as such:
 * var obj = MyCalendar()
 * var param_1 = obj.book(startTime,endTime)
 */