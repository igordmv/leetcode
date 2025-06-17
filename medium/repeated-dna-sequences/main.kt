//https://leetcode.com/problems/repeated-dna-sequences
fun findRepeatedDnaSequences(s: String): List<String> {
    val hashSet = HashSet<String>()
    if (s.length < 10) return emptyList()
    val result = mutableSetOf<String>()
    var left = 0
    var right = 10
    while(right <= s.length) {
        val subsequence = s.substring(left, right)
        if(!hashSet.add(subsequence)) {
            result.add(subsequence)
        }
        left++
        right++
    }
    return result.toList()
}