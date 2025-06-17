//https://leetcode.com/problems/longest-palindromic-substring
fun longestPalindrome(s: String): String {
    if (s.length < 2) return s
    var answer = s.substring(0, 1)
    for (i in s.indices) {
        var left = i - 1
        var right = i + 1
        while(left >= 0 && right < s.length) {
            if(s[left] == s[right]) {
                val palindrome = s.substring(left, right + 1)
                if (palindrome.length > answer.length) {
                    answer = palindrome
                }
                left--
                right++
            } else {
                break
            }
        }
        left = i
        right = i + 1
        while(left >= 0 && right < s.length) {
            if(s[left] == s[right]) {
                val palindrome = s.substring(left, right + 1)
                if (palindrome.length > answer.length) {
                    answer = palindrome
                }
                left--
                right++
            } else {
                break
            }
        }
    }
    return answer
}