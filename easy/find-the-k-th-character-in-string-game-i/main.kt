//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/
    fun kthCharacter(k: Int): Char {
        return findK(k, "a")
    }

    private fun findK(k: Int, curr: String): Char {
        if (curr.length >= k) {
            return curr[k - 1]
        }
        var toAppend = ""
        for (i in curr.indices) {
            toAppend += if (curr[i] == 'z') 'a' else curr[i] + 1
        }
        return findK(k, curr + toAppend)
    }