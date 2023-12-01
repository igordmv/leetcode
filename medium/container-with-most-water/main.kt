//https://leetcode.com/problems/container-with-most-water
fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var maxWater = 0
        var lowerBarUsed = 1
        while (left < height.lastIndex) {
            if (right > left) {
                var lowerBar: Int
                if (height[left] > height[right]) {
                    lowerBar = height[right]
                } else {
                    lowerBar = height[left]
                }
                val area = lowerBar * (right-left)

                if (area > maxWater) {
                    maxWater = area
                    lowerBarUsed = lowerBar
                }
                if (height[left] <= lowerBarUsed) {
                    right = height.lastIndex
                    left++
                } else {
                    right--
                }
            } else {
                right = height.lastIndex
                left++
            }
        }
        return maxWater
}