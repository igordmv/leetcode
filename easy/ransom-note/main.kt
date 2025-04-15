//https://leetcode.com/problems/ransom-note/
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val ransomNoteCountMap = ransomNote.groupingBy { it }.eachCount()
    val magazineCountMap = magazine.groupingBy { it }.eachCount()
    for ((key, value) in ransomNoteCountMap) {
        if(magazineCountMap.getOrDefault(key, Integer.MIN_VALUE) < value) {
            return false
        }
    }
    return true
}