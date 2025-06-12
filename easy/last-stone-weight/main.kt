//https://leetcode.com/problems/last-stone-weight/
fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>(compareByDescending { it })
        for(stone in stones) {
            maxHeap.add(stone)
        }
        while(maxHeap.isNotEmpty()) {
            val stoneOne = maxHeap.poll()
            if(maxHeap.isEmpty()) {
                return stoneOne
            } else {
                val stoneTwo = maxHeap.poll()
                if (stoneOne == stoneTwo) {
                    if (stones.size == 2 || maxHeap.isEmpty()) {
                        return 0
                    }
                } else {
                    maxHeap.add(Math.abs(stoneOne - stoneTwo))
                }
            }
        }
    return 0
}