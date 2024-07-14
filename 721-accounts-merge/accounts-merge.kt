class DisjointSet(size: Int) {
  private val parent = Array(size) { it }
  private val rank = Array(size) { 0 }

  fun union(a: Int, b: Int) {
    val pa = find(a)
    val pb = find(b)
    if (pa == pb) return
    if (rank[pa] > rank[pb]) {
      parent[pb] = pa
    } else if (rank[pa] < rank[pb]) {
      parent[pa] = pb
    } else {
      parent[pa] = pb
      rank[pb]++
    }
  }

  fun find(a: Int): Int {
    if (parent[a] != a) {
      parent[a] = find(parent[a])
    }
    return parent[a]
  }
}

class Solution {
    fun accountsMerge(accounts: List<List<String>>): List<List<String>> {
        val ds = DisjointSet(accounts.size)
        val emailToId = mutableMapOf<String,Int>()

        accounts.forEachIndexed { i, a ->
            for(j in 1 until a.size){
                if(emailToId.contains(a[j])){
                    ds.union(i,emailToId[a[j]]!!)
                } else {
                    emailToId[a[j]] = i
                }
            }
        }

        val idToEmails = mutableMapOf<Int, MutableList<String>>()
        for((e,i) in emailToId){
            val parent = ds.find(i)
            if(idToEmails.contains(parent)){
                idToEmails[parent]!!.add(e)
            } else {
                idToEmails[parent] = mutableListOf(e)
            }
        }
        val result = mutableListOf<MutableList<String>>()
        for((i,e) in idToEmails) {
            val acc = mutableListOf<String>()
            acc.add(accounts[i][0])
            e.sort()
            acc.addAll(e)
            result.add(acc)
        }

        return result


    }
}

