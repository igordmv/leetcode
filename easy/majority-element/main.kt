//https://leetcode.com/problems/majority-element
fun majorityElement(nums: IntArray): Int {
    if (nums.size == 1) return nums[0]

    val map = HashMap<Int, Boolean>()
    var answer = 0
    var majorityElement = 0
    for (item in nums) {
        if (!map.containsKey(item)) {
            val count = nums.filter { it == item }.size
            if (count > answer) {
                answer = count
                majorityElement = item
            }
            map[item] = true
        }
    }
   return majorityElement
}