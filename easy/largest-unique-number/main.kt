//https://leetcode.com/problems/largest-unique-number/
fun largestUniqueNumber(nums: IntArray): Int {
    val map = HashMap<Int,Int>()
    nums.forEach { num ->
        if (!map.containsKey(num)) {
            map[num] = 1
        } else {
            map.put(num, map[num]?.plus(1)?: 0)
        }
    }
    val answer = map.filter { (key, value) -> 
        value == 1
    }.keys.toList()
    return answer.maxOrNull()?: -1
}