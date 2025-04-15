//https://leetcode.com/problems/reverse-words-in-a-string/
fun reverseWords(s: String): String {
    var words = s.split(" ").reversed()
    var resultString = ""
    words.forEach { word ->
        if (word != "") {
            resultString += word.trim() + " "
        }
    }
    return resultString.dropLast(1)
}