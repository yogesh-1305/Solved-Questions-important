fun main() {
    
    val string = "Hello How are you!"
    var counter = 0
    val vowels = "aeiou"

    for (char in string) {
        if(vowels.contains(char)){
            counter++
        }
    }

    println("$countre vowels found")

}