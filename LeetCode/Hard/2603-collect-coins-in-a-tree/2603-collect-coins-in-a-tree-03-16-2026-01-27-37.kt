class Solution {
    fun collectTheCoins(coins: IntArray, edges: Array<IntArray>): Int {
        val total = coins.size
        val adj = Array(total){ mutableSetOf<Int>()}

        for(e in edges){
            adj[e[0]].add(e[1])
            adj[e[1]].add(e[0])
        }

        val q = ArrayDeque<Int>()
        for(n in 0 until total){
            if(adj[n].size == 1 && coins[n] == 0){
                q.addLast(n)
            }
        }
        
        while(q.isNotEmpty()){
            val leaf = q.removeFirst()
            for(nbr in adj[leaf]){
                adj[nbr].remove(leaf)
                if(adj[nbr].size == 1 && coins[nbr] == 0){
                    q.addLast(nbr)
                }
            }
            adj[leaf].clear()
        }

        repeat(2){
            val leaves = (0 until total).filter { adj[it].size == 1 }
            for(leaf in leaves){
                for(nbr in adj[leaf]){
                    adj[nbr].remove(leaf)
                }
                adj[leaf].clear()
            }
        }


        return adj.sumOf { it.size }
    }
}