// --------------OUTPUT--------------------
// #     
// ##    
// ###   
// ####  
// ##### 
// ######
fun main(args: Array<String>){
    val steps = 6
    
    for(row in 0..steps-1){
        var level = ""

        for(col in 0..steps-1){

            if(col <= row){
                level += "#"
            }
            if(col > row){
                level += " "
            }
        }
        println(level)
    }
}

// ===================================================================================
// ----------------------OUTPUT------------------------
// #######
//  ######
//   #####
//    ####
//     ###
//      ##
//       #
fun main(args: Array<String>){
    val steps = 6
    
    for(row in steps-1 downTo 0){
        var level = ""

        for(col in steps-1 downTo 0){

            if(col <= row){
                level += "#"
            }
            if(col > row){
                level += " "
            }
        }
        println(level)
    }
}

fun main(args: Array<String>){
    val steps = 6
    
    for(row in 0..steps-1){
        var level = ""

        for(col in 0..steps-1){

            if(col >= row){
                level += "#"
            }
            if(col < row){
                level += " "
            }
        }
        println(level)
    }
}

// ============================================================================================
// ---------------OUTPUT-------------------
//      #
//     ##
//    ###
//   ####
//  #####
// ######
fun main(args: Array<String>){
    val steps = 6
    
    for(row in 0..steps-1){
        var level = ""

        for(col in 0..steps-1){

            if(col >= steps - row - 1){
                level += "#"
            }
            if(col < steps - row - 1){
                level += " "
            }
        }
        println(level)
    }
}


// ===========================================================================================
///////////// OUTPUT //////////////////

//     #    
//    ###   
//   #####  
//  ####### 
// #########
fun main(args: Array<String>) {
    val n = 5
    val columns = 2 * n - 1
    val midPoint = Math.floor(columns.toDouble() / 2)
    
    for(row in 0..n-1){
        var level = ""
        
        for(col in 0..columns-1){
            if(midPoint-row <= col && midPoint+row >= col){
                level += "#"
            }else{
                level += " "
            }
        }
        println(level)
    }
}



// ==================================================================================
// ------------------------OUTPUT---------------------------
// ####-####
// ###---###
// ##-----##
// #-------#
// ---------
fun main(args: Array<String>) {
    val n = 5
    val columns = 2 * n - 1
    val midPoint = Math.floor(columns.toDouble() / 2)
    
    for(row in 0..n-1){
        var level = ""
        for(col in 0..columns-1){
            if(midPoint-row <= col && midPoint+row >= col){
                level += "-"
            }else{
                level += "#"
            }
        }
        println(level)
    }
}


// ============================================================================================
// ---------------------------OUTPUT----------------------------------
// #########
//  ####### 
//   #####  
//    ###   
//     #  
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

// ===========================================================================================
    // 4444
	// 4444
	// 4444
	// 4444
    for (i in 1..n) {
        for (j in 1..n) {
            print(n)
        }
        println()
    }
    
// ===========================================================================================
    // 1234
    // 1234
    // 1234
    // 1234
    for (i in 1..n) {
        for (j in 1..n) {
            print(j)
        }
        println()
    }
    
// ===========================================================================================
    //1111
    //2222
    //3333
    //4444
    for (i in 1..n) {
        for (j in 1..n) {
            print(i)
        }
        println()
    }
    
// ===========================================================================================
    //1
    //22
    //333
    //4444
    for (i in 1..n) {
        for (j in 1..i) {
            print(i)
        }
        println()
    }
    
// ===========================================================================================
    //1111
    //222
    //33
    //4
    for (i in 1..n) {
        for (j in i..n) {
            print(i)
        }
        println()
    }
    
// ===========================================================================================
    //    1
    //   22
    //  333
    // 4444
    for (i in 1..n) {
        for (j in 1..n) {
            if (j <= n - i) {
                print(" ")
            } else {
                print(i)
            }
        }
        println()
    }
    
// ===========================================================================================    
   //    1
   //   222
   //  33333
   // 4444444
   for (i in 1..n) {
       for (j in 1..(2 * n - 1)) {
           if (j in (n - i + 1)..(n + i - 1)) {
               print(i)
           } else {
               print(" ")
           }
       }
       println()
   }
   
// ===========================================================================================
   // 4444444
   //  33333 
   //   222  
   //    1  
   for (i in n downTo 1) {
       for (j in 1..(2 * n - 1)) {
           if (j in (n - i + 1)..(n + i - 1)) {
               print(i)
           } else {
               print(" ")
           }
       }
       println()
   }
