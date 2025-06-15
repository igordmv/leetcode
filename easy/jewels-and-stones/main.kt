//https://leetcode.com/problems/jewels-and-stones/
 fun numJewelsInStones(jewels: String, stones: String): Int {
     val hashMap = HashMap<Char, Int>()
     jewels.forEach { jewel ->
         hashMap[jewel] = hashMap.getOrDefault(jewel, 0)
     }
     stones.forEach { stone ->
         if (hashMap.contains(stone)) {
             hashMap[stone] = hashMap.getOrDefault(stone, 0) + 1
         }
     }
     return hashMap.values.sum()
 }