//https://leetcode.com/problems/palindrome-number
fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val array = x.toString().toCharArray()
    var left = 0
    var right = array.size -1
    while (left < right) {
        if (array[left] != array[right]) {
            return false
        }
        left++
        right--
    }
    return true
}