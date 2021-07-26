fun main(){
    var str1 = "hello!@   @!@"
    var str2 = "lleoh"

    val regex = Regex("[^A-Za-z0-9 ]")
    str1 = str1.replace(regex,"").trim().toLowerCase().toCharArray().sorted().joinToString()
    str2 = str2.replace(regex,"").trim().toLowerCase().toCharArray().sorted().joinToString()

    if (str1 == str2) println(true) else println(false)
}