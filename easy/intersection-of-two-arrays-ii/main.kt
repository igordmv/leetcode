//https://leetcode.com/problems/intersection-of-two-arrays-ii
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val map = HashMap<Int, Int>()
    val result = mutableListOf<Int>()
    nums1.forEach { num ->
        map[num] = map.getOrPut(num) { 0 } + 1
    }
    nums2.forEach { num ->
        if (map.contains(num)) {
            val quantity = map[num]!!
            if (quantity > 0) {
                result.add(num)
                map[num] = map.getOrPut(num) { 0 } - 1
            }
        }
    }
    return result.toIntArray()
}