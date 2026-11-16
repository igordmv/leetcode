//https://leetcode.com/problems/longest-common-prefix/
    fun longestCommonPrefix(strs: Array<String>): String {
        val map = hashMapOf<String, Int>()

        for (str in strs) {
            var word = ""

            for (char in str) {
                word += char
                map[word] = (map[word] ?: 0) + 1
            }
        }

        var longest = ""

        for ((prefix, count) in map) {
            if (count == strs.size && prefix.length > longest.length) {
                longest = prefix
            }
        }

        return longest
    }
