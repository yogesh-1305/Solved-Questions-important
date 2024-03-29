
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

// another approach decimal to binary
fun main(args: Array<String>) {
    val num = 19
    
    // converting decimal to binary
    val binary = Integer.toBinaryString(num)
    println("$num in decimal = $binary in binary")
}

// convery binary to decimal
fun convertBinaryToDecimal(num: Long): Int {
    var num = num
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}
