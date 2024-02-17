// put n as a +ve number for left ratation
// or
// put n as a -ve number for right ratation
fun rotateArray(array: ArrayList<Int>, n: Int): ArrayList<Int> {

    val length = array.size

    var k = n % length

    if (k < 0) {
        k = k + length
    }

    var s1 = "asdasdfad"
    for (i in s1.toCharArray())

    var map = mutableMapOf<String, Int>()
        map.containsKey("a")
    reverseArray(array, 0, k - 1)

    reverseArray(array, k, length - 1)

    reverseArray(array, 0, length - 1)

    return array;

}

fun reverseArray(array: ArrayList<Int>, start: Int, end: Int) {

    var s = start
    var e = end
    var temp: Int
    while (s < e) {
        temp = array[s]
        array[s] = array[e]
        array[e] = temp

        s += 1
        e -= 1
    }

}