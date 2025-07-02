//https://leetcode.com/problems/moving-average-from-data-stream/
class MovingAverage(val size: Int) {
    var list = LinkedList<Int>()
    var sum = 0
    fun next(`val`: Int): Double {  
        list.add(`val`) 
        sum += `val`
        if (list.size > size) {
            sum -= list.pop()
        } 
        return sum.toDouble() / list.size.toDouble()
    }

}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * var obj = MovingAverage(size)
 * var param_1 = obj.next(`val`)
 */