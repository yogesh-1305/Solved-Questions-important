// fun main(args: Array<String>){
//     val steps = 6
    
//     for(row in 0..steps-1){
//         var level = ""

//         for(col in 0..steps-1){

//             if(col <= row){
//                 level += "#"
//             }
//             if(col > row){
//                 level += " "
//             }
//         }
//         println(level)
//     }
// }

// --------------OUTPUT--------------------
// #     
// ##    
// ###   
// ####  
// ##### 
// ######

// ===================================================================================

// fun main(args: Array<String>){
//     val steps = 6
    
//     for(row in steps-1 downTo 0){
//         var level = ""

//         for(col in steps-1 downTo 0){

//             if(col <= row){
//                 level += "#"
//             }
//             if(col > row){
//                 level += " "
//             }
//         }
//         println(level)
//     }
// }

// fun main(args: Array<String>){
//     val steps = 6
    
//     for(row in 0..steps-1){
//         var level = ""

//         for(col in 0..steps-1){

//             if(col >= row){
//                 level += "#"
//             }
//             if(col < row){
//                 level += " "
//             }
//         }
//         println(level)
//     }
// }
// ----------------------OUTPUT------------------------
// #######
//  ######
//   #####
//    ####
//     ###
//      ##
//       #

// ============================================================================================

// fun main(args: Array<String>){
//     val steps = 6
    
//     for(row in 0..steps-1){
//         var level = ""

//         for(col in 0..steps-1){

//             if(col >= steps - row - 1){
//                 level += "#"
//             }
//             if(col < steps - row - 1){
//                 level += " "
//             }
//         }
//         println(level)
//     }
// }
// ---------------OUTPUT-------------------
//      #
//     ##
//    ###
//   ####
//  #####
// ######

// ===========================================================================================

// fun main(args: Array<String>) {
//     val n = 5
//     val columns = 2 * n - 1
//     val midPoint = Math.floor(columns.toDouble() / 2)
    
//     for(row in 0..n-1){
//         var level = ""
        
//         for(col in 0..columns-1){
//             if(midPoint-row <= col && midPoint+row >= col){
//                 level += "#"
//             }else{
//                 level += " "
//             }
//         }
//         println(level)
//     }
// }

///////////// OUTPUT //////////////////

//     #    
//    ###   
//   #####  
//  ####### 
// #########

// ==================================================================================

// fun main(args: Array<String>) {
//     val n = 5
//     val columns = 2 * n - 1
//     val midPoint = Math.floor(columns.toDouble() / 2)
    
//     for(row in 0..n-1){
//         var level = ""
//         for(col in 0..columns-1){
//             if(midPoint-row <= col && midPoint+row >= col){
//                 level += "-"
//             }else{
//                 level += "#"
//             }
//         }
//         println(level)
//     }
// }
// ------------------------OUTPUT---------------------------
// ####-####
// ###---###
// ##-----##
// #-------#
// ---------

// ============================================================================================

fun main(args: Array<String>) {
    val n = 5
    val columns = 2 * n - 1
    val midPoint = Math.floor(columns.toDouble() / 2)
    
    for(row in n-1 downTo 0){
        var level = ""
        for(col in columns-1 downTo 0){
            if(midPoint-row <= col && midPoint+row >= col){
                level += "#"
            }else{
                level += " "
            }
        }
        println(level)
    }
}
// ---------------------------OUTPUT----------------------------------
// #########
//  ####### 
//   #####  
//    ###   
//     #  