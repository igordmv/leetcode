// https://leetcode.com/problems/minimum-genetic-mutation/
class Solution {
    fun minMutation(startGene: String, endGene: String, bank: Array<String>): Int {
        if (startGene == endGene) return 0

        val queue = ArrayDeque<Pair<String, Int>>()
        queue.addFirst(Pair(startGene, 0))
        val visited = mutableSetOf(startGene)
        while (queue.isNotEmpty()) {
            val (gene, mutations) = queue.removeLast()
            visited.add(gene)

            if (gene == endGene) {
                return mutations
            }

            for (geneBank in bank) {
                if (geneBank !in visited && isOneMutationAway(gene, geneBank)) {
                    queue.addFirst(Pair(geneBank, mutations + 1))
                }
            }
        }
        return -1
    }

    fun isOneMutationAway(startGene: String, endGene: String): Boolean {
        var count = 0
        for (i in startGene.indices) {
            if (startGene[i] != endGene[i]) {
                count++
            }
            if (count > 1) {
                return false
            }
        }
        return count == 1
    }
}
