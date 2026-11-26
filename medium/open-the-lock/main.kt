// https://leetcode.com/problems/open-the-lock/
class Solution {
    fun openLock(deadends: Array<String>, target: String): Int {
        if ("0000" in deadends) return -1

        val movements = mapOf(
            '0' to listOf('9', '1'),
            '1' to listOf('0', '2'),
            '2' to listOf('1', '3'),
            '3' to listOf('2', '4'),
            '4' to listOf('3', '5'),
            '5' to listOf('4', '6'),
            '6' to listOf('5', '7'),
            '7' to listOf('6', '8'),
            '8' to listOf('7', '9'),
            '9' to listOf('8', '0'),
        )
        val visited = mutableSetOf("0000")
        val queue = ArrayDeque<Pair<String, Int>>()
        queue.addFirst(Pair("0000", 0))

        while (queue.isNotEmpty()) {
            val (state, moves) = queue.removeLast()
            visited.add(state)
            if (state == target) {
                return moves
            }
            for (index in state.indices) {
                movements[state[index]]?.forEach { newDigit ->
                    val digits = state.toCharArray()
                    digits[index] = newDigit
                    val newCode = String(digits)

                    if (newCode !in deadends && newCode !in visited) {
                        visited.add(newCode)
                        queue.addFirst(Pair(newCode, moves + 1))
                    }
                }
            }
        }
        return -1
    }
}
