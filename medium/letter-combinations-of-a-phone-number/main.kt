//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        val map = mapOf(
            '2' to listOf("a", "b", "c"),
            '3' to listOf("d", "e", "f"),
            '4' to listOf("g", "h", "i"),
            '5' to listOf("j", "k", "l"),
            '6' to listOf("m", "n", "o"),
            '7' to listOf("p", "q", "r", "s"),
            '8' to listOf("t", "u", "v"),
            '9' to listOf("w", "x", "y", "z")
        )

        var combinations = listOf("")

        for (digit in digits) {
            val letters = map[digit] ?: return emptyList()
            val nextCombinations = mutableListOf<String>()

            for (combination in combinations) {
                for (letter in letters) {
                    nextCombinations.add(combination + letter)
                }
            }

            combinations = nextCombinations
        }

        return combinations
    }
