fun main(){
    var int = -1234
    var reversed = 0

    while(int != 0){
        var remainder = int % 10
        reversed = reversed * 10 + remainder 
        int /= 10
    }

    println(reversed)
}

// --------------------ANOTHER APPROACH----------------------

// fun main(){
//     val int = -10023
//     val regex = Regex("[^A-Za-z0-9 ]")
//     var result = int.toString().replace(regex,"").split("").reversed().joinToString("")
    
//     if(int > 0) println(result.toInt()) else println(result.toInt() * -1)   
// }