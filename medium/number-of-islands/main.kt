// https://leetcode.com/problems/number-of-islands/
class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var islandsCounter = 0
        val map = hashMapOf<Pair<Int, Int>, Boolean>()
        val positionsToVisit = listOf(
            Pair(-1, 0),
            Pair(1, 0),
            Pair(0, -1),
            Pair(0, 1)
        )
        val queue = ArrayDeque<Pair<Int, Int>>()

        for (i in grid.indices) {
            for (y in grid[i].indices) {
                if (grid[i][y] == '1') {
                    map[Pair(i, y)] = false
                }
            }
        }

        for ((position, visited) in map) {
            if (!visited) {
                islandsCounter++
                map[position] = true
                queue.addLast(position)

                while (queue.isNotEmpty()) {
                    val current = queue.removeFirst()
                    for (offset in positionsToVisit) {
                        val positionToCheck = Pair(current.first + offset.first, current.second + offset.second)
                        if (map[positionToCheck] == false) {
                            map[positionToCheck] = true
                            queue.addLast(positionToCheck)
                        }
                    }
                }
            }
        }
        return islandsCounter
    }
}
