//https://leetcode.com/problems/jump-game-ii
fun jump(nums: IntArray): Int {
    if (nums.size == 1) return 1
    val reachList = mutableListOf<Int>()
    for (i in 0..nums.size - 1) {
        reachList.add(i + nums[i])
    }
    var toReach = nums.size - 1
    var maxWalkToReach = nums.size - 2
    var result = 0
    while (toReach > 0) {
        var index = toReach - 1
        while (index >= 0) {
            if(reachList[index] >= toReach) {
                maxWalkToReach = index
            }
            index--
        }
        if(reachList[maxWalkToReach] >= toReach) {
            toReach = maxWalkToReach
            result++
        }
    }
    return result
}  
