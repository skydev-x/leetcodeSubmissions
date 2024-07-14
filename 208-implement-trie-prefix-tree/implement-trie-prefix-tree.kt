class TrieNode {
    val children = mutableMapOf<Char,TrieNode>()
    var isWord = false
}

class Trie() {

    val root = TrieNode()

    fun insert(word: String) {
        var p = root
        for(c in word){
            if(!p.children.contains(c)){
                p.children[c] = TrieNode()
            } 
            p = p.children[c]!!
        }
        p.isWord = true
    }

    fun search(word: String): Boolean {
        var p = root
        for(c in word){
            if(p.children.contains(c)){
                p = p.children[c]!!
            } else {
                return false
            }
        }
        return p.isWord
    }

    fun startsWith(prefix: String): Boolean {
        var p = root
        for(c in prefix){
            if(p.children.contains(c)){
                p = p.children[c]!!
            } else {
                return false
            }
        }
        return true
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * var obj = Trie()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */