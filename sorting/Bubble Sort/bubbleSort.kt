fun main(args: Array<String>) {
    var array = arrayOf(1, 2, 3, 4, 5, 6,12,44,6,887,35,4363,63,3463,3665, 4, 3, 2)

    for (i in 0..array.size - 1) {
        for (j in 0..array.size - 2 - i) {
            if (array[j + 1] < array[j]) {
                var temp = array[j + 1]
                array[j + 1] = array[j]
                array[j] = temp
            }
        }
    }

    for (i in array) {
        print("$i ")
    }
}
