// https://leetcode.com/problems/bus-routes/
class Solution {
    fun numBusesToDestination(
        routes: Array<IntArray>,
        source: Int,
        target: Int
    ): Int {
        if (source == target) return 0

        val routeMap = hashMapOf<Int, MutableSet<Int>>()
        for (routeIndex in routes.indices) {
            for (busStop in routes[routeIndex]) {
                routeMap.getOrPut(busStop) { mutableSetOf() }.add(routeIndex)
            }
        }

        val queue = ArrayDeque<Pair<Int, Int>>()
        val visitedRoutes = mutableSetOf<Int>()

        for (routeIndex in routeMap[source].orEmpty()) {
            visitedRoutes.add(routeIndex)
            queue.addLast(Pair(routeIndex, 1))
        }

        while (queue.isNotEmpty()) {
            val (routeIndex, busCount) = queue.removeFirst()

            for (busStop in routes[routeIndex]) {
                if (busStop == target) return busCount

                for (nextRoute in routeMap[busStop].orEmpty()) {
                    if (nextRoute !in visitedRoutes) {
                        visitedRoutes.add(nextRoute)
                        queue.addLast(Pair(nextRoute, busCount + 1))
                    }
                }
            }
        }

        return -1
    }
}
