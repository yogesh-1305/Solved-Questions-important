// Question: Find a sub-array in the given array in which the sum of 
// all the elements of the sub-array == k


// Brute Force
// O(N^2)

// fun main(){
//     val array = arrayOf(1,2,2,3,-6,5,-6)
//     val k = 3
//     var found = false

//     for (i in 0..array.size-1){
//         var sum = 0
//         for (j in 0..array.size-1){
//             sum +=  array[j]
//             if(sum == k){
//                 found = true
//                 break
//             }
//         }
//         if (found) {
//             println(true)
//             break
//         }
//     }
// }


// ===============================================================

// Optimized Approach
// O(N)

fun main(){
    val array = arrayOf(2,4,1,,3,-6,5,-6)
    val k = 3
    val set = HashSet<Int>()

    var sum = 0
    for (i in array){
        set.add(sum)
        sum += i
        if(set.contains(sum - k)){
            println(true)
            break
        }
    }
}
