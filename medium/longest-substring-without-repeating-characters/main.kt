//https://leetcode.com/problems/longest-substring-without-repeating-characters/
fun lengthOfLongestSubstring(s: String): Int {
    val map = HashMap<Char, Int>()
    var left = 0
    var maxLength = 0
    for (right in s.indices) {
        val currentChar = s[right]
        if (map.containsKey(currentChar) && map[currentChar]!! >= left) {
            left = map[currentChar]!! + 1
        }
        map[currentChar] = right
        maxLength = max(maxLength, right - left + 1)
    }
    return maxLength
}