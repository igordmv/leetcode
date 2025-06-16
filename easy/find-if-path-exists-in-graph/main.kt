//https://leetcode.com/problems/find-if-path-exists-in-graph/
fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
    // Build the graph as an adjacency list
    val graph = mutableMapOf<Int, MutableList<Int>>()
    for ((a, b) in edges) {
        graph.computeIfAbsent(a) { mutableListOf() }.add(b)
        graph.computeIfAbsent(b) { mutableListOf() }.add(a)
    }
    val seen = BooleanArray(n)
    val queue: ArrayDeque<Int> = ArrayDeque()
    seen[source] = true
    queue.add(source)
    while (queue.isNotEmpty()) {
        val curr = queue.removeFirst()
        if (curr == destination) return true
        for (neighbor in graph[curr].orEmpty()) {
            if (!seen[neighbor]) {
                seen[neighbor] = true
                queue.add(neighbor)
            }
        }
    }
    return false
}