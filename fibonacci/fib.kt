fun main() {
    println(fibIter(5))
}


// ------------------------RECURSION----------------------
fun fibRec(n: Int): Int {
    if (n < 2) return n

    return fibRec(n - 1) + fibRec(n - 2)
}

// -------------------------ITERATIVE--------------------------

fun fibIterative(n: Int) {

    if (n == 0) {
        print(n)
        return
    }

    var first = 0
    var first = 1
    var next: Int

    print("$first,")
    print("$second,")

    for (i in 2..n) {
        next = first + second
        print("$next,")

        first = second
        second = next
    }
}

fun fibIter(n: Int): Any {
    var list = ArrayList<Int>()

    if (n == 0) {
        list.add(0)
        return list.toString()
    }
    list.apply {
        add(0)
        add(1)
    }

    for (i in 2..n) {
        var next = list[i - 1] + list[i - 2]
        list.add(next)
    }

    return list.toString()

}