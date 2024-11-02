//https://leetcode.com/problems/find-players-with-zero-or-one-losses/
fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val winners = mutableSetOf<Int>()
    val losersMap = HashMap<Int,Int>()

    matches.forEach { match ->
        val winner = match[0]
        val loser = match[1]
        winners.add(winner)
        if(!losersMap.containsKey(loser)) {
            losersMap[loser] = 1
        } else {
            losersMap.put(loser, losersMap[loser]?.plus(1)?: 0)
        }
    }
    val answerOne = winners.filter { winner -> 
        losersMap.containsKey(winner) == false
    }.toList()
    val answerTwo = losersMap.filter { (key, value) ->
        value == 1
    }.keys.toList()
    return listOf(answerOne.sorted(), answerTwo.sorted())
}