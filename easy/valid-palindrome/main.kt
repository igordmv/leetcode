//https://leetcode.com/problems/valid-palindrome/
fun isPalindrome(s: String): Boolean {
    val re = Regex("[^A-Za-z0-9 ]")
    val newString = re.replace(s, "").replace(" ", "").lowercase()
    var start = 0
    var end = newString.length - 1
    while (start < end) {
            if (newString[start] != newString[end]) {
                return false
            }
            start++
            end--
    }
    return true
}