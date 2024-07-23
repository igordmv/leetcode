//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
fun checkIfPangram(sentence: String): Boolean {
    val map = getInitializedHashMap()
    for (s in sentence) {
            map[s] = 1
            val numberOfAppearedLetters = map.values.count { it == 1}
            if (numberOfAppearedLetters == 26) {
                return true
            }
    }
    return false
}

fun getInitializedHashMap(): HashMap<Char, Int> {
    return hashMapOf('a' to 0 , 'b' to 0 , 'c' to 0, 'd' to 0, 'e' to 0, 'f' to 0, 'g' to 0, 'h' to 0,
    'i' to 0, 'j' to 0, 'k' to 0, 'l' to 0, 'm' to 0, 'n' to 0, 'o' to 0, 'p' to 0, 'q' to 0,   'r' to 0, 's' to 0, 't' to 0,
    'u' to 0, 'v' to 0, 'w' to 0, 'x' to 0, 'y' to 0, 'z' to 0)
}
