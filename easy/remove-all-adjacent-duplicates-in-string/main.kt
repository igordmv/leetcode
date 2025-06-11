//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    fun removeDuplicates(s: String): String {
        if (s.isEmpty()) return s
        val stack = Stack<Char>()
        for (char in s) {
            if (stack.isNotEmpty() && stack.peek() == char) {
                stack.pop()
            } else {
                stack.push(char)
            }
        }
        return stack.joinToString(separator = "")
    }