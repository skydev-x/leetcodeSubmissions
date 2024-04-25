class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val fmap = mutableMapOf<String, MutableList<String>>()
        
        strs.forEach { str ->
            val sortedStr = str.toCharArray().sorted().joinToString("")
            if (!fmap.containsKey(sortedStr)) {
                fmap[sortedStr] = mutableListOf(str)
            } else {
                fmap[sortedStr]?.add(str)
            }
        }
        
        return fmap.values.toList()
    }
}