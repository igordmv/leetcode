//https://leetcode.com/problems/is-subsequence/
fun isSubsequence(s: String, t: String): Boolean {
    var sIndex = 0
    var tIndex = 0
    var result = ""
    while (sIndex <= s.lastIndex && tIndex <= t.lastIndex) {
        if (s[sIndex] == t[tIndex]) {
            result += s[sIndex]
            sIndex++
            tIndex++
        } else {
            tIndex++
        }
    }
    return result == s
}