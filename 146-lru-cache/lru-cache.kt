class LRUCache(private val capacity: Int) {

    class Node(val key: Int, var value: Int) {
        var next: Node? = null
        var prev: Node? = null
    }

    private val head = Node(0, 0)
    private val tail = Node(0, 0)
    private val cache = mutableMapOf<Int, Node>()

    init {
        head.next = tail
        tail.prev = head
    }

    // Add node at head
    private fun add(node: Node) {
        node.prev = head
        node.next = head.next
        head.next?.prev = node
        head.next = node
    }

    // remove
    private fun remove(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    // Move node to the head (most recently used)
    private fun moveToHead(node: Node) {
        remove(node)
        add(node)
    }

    // Remove the tail node (least recently used)
    private fun removeTail(): Node {
        val res = tail.prev!!
        remove(res)
        return res
    }

    fun get(key: Int): Int {
        val node = cache[key] ?: return -1
        moveToHead(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        val node = cache[key]
        if (node != null) {
            node.value = value
            moveToHead(node)
        } else {
            val newNode = Node(key, value)
            cache[key] = newNode
            add(newNode)
            if (cache.size > capacity) {
                val tail = removeTail()
                cache.remove(tail.key)
            }
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */