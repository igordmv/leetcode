//https://leetcode.com/problems/3sum/
fun threeSum(nums: IntArray): List<List<Int>> {
    val list = mutableSetOf<List<Int>>()
    nums.sort()

    for (i in 0 until nums.size-2){
        var left = i + 1
        var right = nums.size-1
        while (left < right){

            val sum = nums[i] + nums[left] + nums[right]

            if (sum == 0){
                list.add(listOf(nums[i], nums[left], nums[right]))
                left++
                right--
            }

            else if (sum < 0) left++

            else right--
        }
    }
    return list.toList()
}
