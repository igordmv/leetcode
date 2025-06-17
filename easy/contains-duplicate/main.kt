//https://leetcode.com/problems/contains-duplicate/
fun containsDuplicate(nums: IntArray): Boolean {
    val map = HashMap<Int, Boolean>()
    nums.forEach { num ->
        if (map.containsKey(num)) {
            return true
        } else {
            map[num] = true
        }
    }
    return false
}