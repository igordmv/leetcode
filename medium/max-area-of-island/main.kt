//https://leetcode.com/problems/max-area-of-island/
fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    var maxArea = 0
    val lines = grid.size
    val columns = grid[0].size
    val seen = Array(lines) { BooleanArray(columns) }
    
    for (line in grid.indices) {
        for (column in grid[line].indices) {
            if (grid[line][column] == 1 && !seen[line][column]) {
                maxArea = maxOf(maxArea, getMaxAreaOfItem(grid, seen, line, column))
            }
        }
    }
    return maxArea
}

fun getMaxAreaOfItem(
    grid: Array<IntArray>,
    seen: Array<BooleanArray>,
    line: Int,
    column: Int
): Int {
    if (line !in grid.indices || column !in grid[line].indices) {
        return 0
    }
    if(grid[line][column] == 1 && !seen[line][column]) {
        seen[line][column] = true
        return 1 + (
            getMaxAreaOfItem(grid, seen, line - 1, column) +
            getMaxAreaOfItem(grid, seen, line, column - 1) +
            getMaxAreaOfItem(grid, seen, line, column + 1) +
            getMaxAreaOfItem(grid, seen, line + 1, column)
        )
    } else {
        return 0
    }
}