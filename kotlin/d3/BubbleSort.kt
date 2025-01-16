/**
 * Try out of the bubble sort algorithm in kotlin
 * Given to list of integers, merge them and sort the array in ascending order using the Bubble Sort algorithm above.
 * Repetition is permited.
 *   
*/

fun bubbleSort(ar: List<Int>, ar2: List<Int>): List<Int> {
 
  var merged = ar.toMutableList()
  merged.addAll(ar2)
  
  val n = merged.size
  var changed: Boolean

  for (i in 0 until n -1) {
    changed = false

    for(j in 0 until n - i - 1) {
      if (merged[j] > merged[j + 1]) {
        val temp = merged[j]
        merged[j] = merged[j + 1]
        merged[j + 1] = temp
        changed = true
      }

    }
    if (!changed) break


  }
  return merged
}

fun main(args: Array<String>) {
  
  val ar = listOf(4, 5, 1, 9, 3, 7)
  val ar2 = listOf(8, 6, 1, 4, 2, 0)

  val result = bubbleSort(ar, ar2)

  println(result)
}