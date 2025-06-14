//https://leetcode.com/problems/ipo/description/
fun findMaximizedCapital(k: Int, wInit: Int, profits: IntArray, capital: IntArray): Int {
        val n = profits.size
        val projects = Array(n) { i -> intArrayOf(capital[i], profits[i]) }

        projects.sortBy { it[0] }

        val maxHeap = PriorityQueue<Int>(compareByDescending { it })
        var w = wInit
        var i = 0

        repeat(k) {
            while (i < n && projects[i][0] <= w) {
                maxHeap.add(projects[i][1])
                i++
            }

            if (maxHeap.isEmpty()) return w

            w += maxHeap.poll()
        }

        return w
}