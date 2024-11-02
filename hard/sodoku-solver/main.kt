//https://leetcode.com/problems/sudoku-solver
fun solveSudoku(board: Array<CharArray>): Unit {
    // Arrays to track used numbers in rows, columns, and boxes
    val rows = Array(9) { BooleanArray(9) }
    val cols = Array(9) { BooleanArray(9) }
    val boxes = Array(9) { BooleanArray(9) }

    // Initialize the tracking arrays based on the current board state
    for (i in 0..8) {
        for (j in 0..8) {
            if (board[i][j] != '.') {
                val num = board[i][j] - '1' // Convert char to index (0-8)
                rows[i][num] = true
                cols[j][num] = true
                boxes[(i / 3) * 3 + (j / 3)][num] = true
            }
        }
    }

    // Function to perform backtracking
    fun backtrack(row: Int, col: Int): Boolean {
        // If we've reached the end of the board, we're done
        if (row == 9) return true
        
        // Move to the next cell
        val nextRow = if (col == 8) row + 1 else row
        val nextCol = (col + 1) % 9

        // If the current cell is already filled, skip it
        if (board[row][col] != '.') return backtrack(nextRow, nextCol)

        // Try placing numbers 1-9
        for (num in 0..8) {
            // Check if the number can be placed
            if (!rows[row][num] && !cols[col][num] && !boxes[(row / 3) * 3 + (col / 3)][num]) {
                // Place the number
                board[row][col] = (num + '1'.toInt()).toChar()
                rows[row][num] = true
                cols[col][num] = true
                boxes[(row / 3) * 3 + (col / 3)][num] = true

                // Continue to the next cell
                if (backtrack(nextRow, nextCol)) return true

                // Backtrack
                board[row][col] = '.'
                rows[row][num] = false
                cols[col][num] = false
                boxes[(row / 3) * 3 + (col / 3)][num] = false
            }
        }

        return false // Trigger backtracking
    }

    // Start the backtracking process from the first cell
    backtrack(0, 0)
}