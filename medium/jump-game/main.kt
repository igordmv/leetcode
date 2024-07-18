//https://leetcode.com/problems/jump-game/
fun canJump(nums: IntArray): Boolean {
    if (nums.size == 1) return true
    val reachList = mutableListOf<Int>()
    for (i in 0..nums.size - 1) {
        reachList.add(i + nums[i])
    }
    var toReach = nums.size - 1
    var toCheck = nums.size - 2
    while (toCheck >= 0) {
        //println("toCheck: " + toCheck)
        if(reachList[toCheck] >= toReach) {
            toReach = toCheck
            //println("toReach: " + toReach)
        }
        toCheck--
    }
    if (toReach == 0) {
        return true
    } else {
        return false
    }
}  
