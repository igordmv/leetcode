//https://leetcode.com/problems/reverse-string/
fun reverseString(s: CharArray): Unit {
    var left = 0
    var right = s.lastIndex
    while (left < right) {
        var temp = s[right]
        s[right] = s[left]
        s[left] = temp
        left++
        right--
    }
}