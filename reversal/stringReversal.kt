// fun main(){
//     val str = "Hello world"
//     var reversedString = ""

//     for (i in str.length - 1 downTo 0){
//         reversedString += str[i]
//     }

//     println(reversedString)

// }

/////////////////////////////////////////////////////////

fun main(){
    val str = "Hello World"
    var reversedString = str.split("").reversed().joinToString("")

    println(reversedString)

}