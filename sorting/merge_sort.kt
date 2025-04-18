/*
  🧠 How It Works:
	  •	Divide: Recursively split the list in half.
	  •	Conquer: Recursively sort each half.
	  • Combine: Merge the sorted halves into one sorted list.

  Time complexity: O(n log n)
  Space complexity: O(n) (due to additional lists during merge)
*/
fun main() {
    val numbers = mutableListOf(38, 27, 43, 3, 9, 82, 10)
    println("Original: $numbers")
    val sorted = mergeSort(numbers)
    println("Sorted:   $sorted")
}

// ===============================================================================

fun mergeSort(arr: MutableList<Int>): MutableList<Int> {
    // Base case: If array has 0 or 1 element, it's already sorted
    if (arr.size <= 1) return arr

    // Step 1: Split the array into two halves
    val mid = arr.size / 2
    val left = arr.subList(0, mid).toMutableList()
    val right = arr.subList(mid, arr.size).toMutableList()

    // Step 2: Recursively sort both halves
    val sortedLeft = mergeSort(left)
    val sortedRight = mergeSort(right)

    // Step 3: Merge the sorted halves
    return merge(sortedLeft, sortedRight)
}

// Helper function to merge two sorted lists into one sorted list
fun merge(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int> {
    val result = mutableListOf<Int>()

    var i = 0 // pointer for left
    var j = 0 // pointer for right

    // Compare elements and add the smaller one to result
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            result.add(left[i])
            i++
        } else {
            result.add(right[j])
            j++
        }
    }

    // Add remaining elements from left (if any)
    while (i < left.size) {
        result.add(left[i])
        i++
    }

    // Add remaining elements from right (if any)
    while (j < right.size) {
        result.add(right[j])
        j++
    }

    return result
}
