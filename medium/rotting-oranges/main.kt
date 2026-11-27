// https://leetcode.com/problems/rotting-oranges/
class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val adjacents = listOf(
            Pair(0, -1),
            Pair(-1, 0),
            Pair(0, 1),
            Pair(1, 0),
        )
        val queue = ArrayDeque<Pair<Pair<Int, Int>, Int>>()
        val freshOranges = hashMapOf<Pair<Int, Int>, Boolean>()
        for (row in grid.indices) {
            for (column in grid[row].indices) {
                if (grid[row][column] == 2) {
                    queue.addFirst(Pair(Pair(row, column), 0))
                } else if (grid[row][column] == 1) {
                    freshOranges[Pair(row, column)] = false
                }
            }
        }

        if (freshOranges.isEmpty()) return 0
        if (queue.isEmpty() && freshOranges.isNotEmpty()) return -1

        while (queue.isNotEmpty()) {
            val (rottedOrange, minutes) = queue.removeLast()

            for (adjacent in adjacents) {
                val newLine = rottedOrange.first + adjacent.first
                val newColumn = rottedOrange.second + adjacent.second
                val position = Pair(newLine, newColumn)
                if (newLine in grid.indices && newColumn in grid[newLine].indices) {
                    if (grid[newLine][newColumn] == 1 && freshOranges[position] == false) {
                        freshOranges[position] = true
                        if (false !in freshOranges.values) {
                            return minutes + 1
                        }
                        queue.addFirst(Pair(position, minutes + 1))
                    }
                }
            }
        }
        return -1
    }
}
