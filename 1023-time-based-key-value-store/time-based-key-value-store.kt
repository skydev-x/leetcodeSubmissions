class TimeMap() {


    private val cache: MutableMap<String, MutableList<Pair<Int, String>>> = mutableMapOf()

    fun set(key: String, value: String, timestamp: Int) {
        if (!cache.containsKey(key)) {
            cache[key] = mutableListOf()
        }
        cache[key]?.add(Pair(timestamp, value))
    }

    fun get(key: String, timestamp: Int): String {
        val values = cache[key] ?: return ""
        var left = 0
        var right = values.size - 1
        var result = ""

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (values[mid].first <= timestamp) {
                result = values[mid].second
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return result
    }


}

/**
 * Your TimeMap object will be instantiated and called as such:
 * var obj = TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */