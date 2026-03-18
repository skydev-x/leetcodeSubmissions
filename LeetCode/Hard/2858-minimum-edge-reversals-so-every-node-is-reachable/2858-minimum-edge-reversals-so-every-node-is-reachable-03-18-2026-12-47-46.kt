class Solution {
    fun minEdgeReversals(n: Int, edges: Array<IntArray>): IntArray {
        val graph = Array(n) { mutableListOf<Pair<Int,Int>>() }
        val result = IntArray(n)
        for(e in edges){
            val (u,v) = e
            graph[u].add(v to 0)
            graph[v].add(u to 1)
        }

        fun dfs(u : Int, p : Int) : Int{
            var cost = 0
            for((v,w) in graph[u]){
                if(v == p) continue
                cost += w + dfs(v,u)
            }
            return cost
        }

        result[0] = dfs(0,-1)

        fun reroot(u : Int,p : Int) {
            for((v,w) in graph[u]){
                if(v == p) continue
                result[v] = result[u] + if(w == 0) 1 else - 1
                reroot(v,u)
            }
        }
        reroot(0,-1)
        return result
    }
}