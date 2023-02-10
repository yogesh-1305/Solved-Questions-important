class Solution {


	// Function to calculate the square root of a given number
	// also, we can just use Math.sqrt();
	public static int squareRoot(int num) {

    // temporary variable to store intermediate result
    double t;  
    
    // initial approximation of the square root
    double sqrtroot = num / 2;  
    
    // loop until the approximation is not changed
    do {  
        // store current approximation in temporary variable
        t = sqrtroot;  
        
        // calculate a new approximation using the formula
        sqrtroot = (t + (num / t)) / 2;  
        
        // repeat the loop until the approximation does not change
    } while((t - sqrtroot) != 0);  
    
    // return the final approximation of the square root
    return (int) sqrtroot;  
}  


}