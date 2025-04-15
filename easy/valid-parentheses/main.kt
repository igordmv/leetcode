//https://leetcode.com/problems/valid-parentheses/
fun isValid(s: String): Boolean {
    val map = hashMapOf<Char, Char>( '(' to ')', '[' to ']', '{' to '}')
    val mustCloseList = Stack<Char>()
    s.forEach { char ->
        if (char == '(' || char == '[' || char == '{') {
            mustCloseList.push(char)
        } else {
            val closing = mustCloseList.pop()
            if (map[closing] != char) {
                return false
            }
        }
    }
    return true
}