fun rotateArray(array: ArrayList<Int>, n: Int): ArrayList<Int> {
    val length = array.size
    if (length == 0) return array

    var k = n % length

    // Handle negative rotation (right shift)
    if (k < 0) {
        k += length
    }

    // Step 1: Reverse first part
    reverseArray(array, 0, k - 1)

    // Step 2: Reverse second part
    reverseArray(array, k, length - 1)

    // Step 3: Reverse entire array
    reverseArray(array, 0, length - 1)

    return array
}

fun reverseArray(array: ArrayList<Int>, start: Int, end: Int) {
    var s = start
    var e = end
    while (s < e) {
        val temp = array[s]
        array[s] = array[e]
        array[e] = temp
        s++
        e--
    }
}
