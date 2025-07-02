//https://leetcode.com/problems/valid-parentheses/
    fun isValid(s: String): Boolean {
        if(s.length == 1) {
            return false
        }
        val map = hashMapOf<Char, Char>( '(' to ')', '[' to ']', '{' to '}')
        val mustCloseList = Stack<Char>()
        s.forEach { char ->
            if (char == '(' || char == '[' || char == '{') {
                mustCloseList.push(char)
            } else if (mustCloseList.size > 0){
                val closing = mustCloseList.pop()
                if (map[closing] != char) {
                    return false
                }
            } else {
                return false
            }
        }
        return mustCloseList.size == 0
    }