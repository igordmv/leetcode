//https://leetcode.com/problems/reachable-nodes-with-restrictions/
fun reachableNodes(n: Int, edges: Array<IntArray>, restricted: IntArray): Int {
    val graph = HashMap<Int, MutableList<Int>>()
    val seen = BooleanArray(n)
    val stack = ArrayDeque<Int>()
    var count = 1
    for ((a, b) in edges) {
        graph.getOrPut(a) { mutableListOf() }.add(b)
        graph.getOrPut(b) { mutableListOf() }.add(a)
    }
    stack.add(0)
    seen[0] = true
    while(stack.isNotEmpty()){
        val node = stack.removeFirst()
        val nodeEdges = graph[node]
        nodeEdges?.let {
            for (i in nodeEdges) {
                if (!restricted.contains(i) && !seen[i]) {
                    seen[i] = true
                    stack.add(i)
                    count++
                }
            }
        }
    }
    return count
}