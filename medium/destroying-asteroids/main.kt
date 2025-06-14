//https://leetcode.com/problems/destroying-asteroids/
 fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
     val minHeap = PriorityQueue<Int>()
     var currentMass = mass.toBigInteger()
     for (asteroid in asteroids) {
         minHeap.add(asteroid) // O(log(N)) to add each asteroid
     } // O(N * log(N)) this for
     while(minHeap.isNotEmpty()) { // O(log(N))
         val asteroid = minHeap.poll().toBigInteger()
         if (currentMass >= asteroid) {
             currentMass += asteroid
         } else {
             return false
         }
     }
     return true
 }