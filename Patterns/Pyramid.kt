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

///////////// OUTPUT //////////////////

//     #    
//    ###   
//   #####  
//  ####### 
// #########
