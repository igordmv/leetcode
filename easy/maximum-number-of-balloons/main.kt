//https://leetcode.com/problems/maximum-number-of-balloons
fun maxNumberOfBalloons(text: String): Int {
    var countsMap = HashMap<Char, Int>()
    text.forEach { char -> 
        when(char){
                'b' -> countsMap.put('b', countsMap.getOrDefault('b', 0) + 1)
                'a' -> countsMap.put('a', countsMap.getOrDefault('a', 0) + 1)
                'l' -> countsMap.put('l', countsMap.getOrDefault('l', 0) + 1)
                'o' -> countsMap.put('o', countsMap.getOrDefault('o', 0) + 1)
                'n' -> countsMap.put('n', countsMap.getOrDefault('n', 0) + 1)
            }
    }
    countsMap['l'] = countsMap.getOrDefault('l', 0)/2
    countsMap['o'] = countsMap.getOrDefault('o', 0) /2
    val minCount = listOf(
          countsMap.getOrDefault('b', 0),
          countsMap.getOrDefault('a', 0),
          countsMap.getOrDefault('l', 0),
          countsMap.getOrDefault('o', 0),
          countsMap.getOrDefault('n', 0)
    ).minOrNull() ?: 0

    return minCount
}