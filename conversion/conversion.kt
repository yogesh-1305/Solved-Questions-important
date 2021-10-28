
// convert decimal to binary
fun getBinary(num: Int): String {
    var number = num
    var binaryString = StringBuilder()

    while (number > 0) {
        var r = number % 2
        number /= 2
        binaryString.append(r)
    }

    return binaryString.reverse().toString()
}
