fun countOccurrences(str: String): String {

    /// create a map
    val map = mutableMapOf<Char, Int>()

    for (i in str.toCharArray()) {
        if (map.containsKey(i)) {
            val value = map[i] ?: 0
            map[i] = value + 1
        } else {
            map[i] = 1
        }
    }

    var result = ""
    for (i in map.keys) {
        result += "$i${map[i]}"
    }

    return result
}