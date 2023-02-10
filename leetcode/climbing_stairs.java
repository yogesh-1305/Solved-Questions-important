class Solution {

    /*
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Example:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

    */
    public int climbStairs(int n) {
        // Check if n is 1, return 1 as there is only one way to climb 1 step
        if(n == 1) return 1;

        // Check if n is 2, return 2 as there are two ways to climb 2 steps
        if(n == 2) return 2;

        // Next, an array a of size n is created to store the number of ways to climb the stairs at each step.
        int[] a =  new int[n];

        //The first two elements of the array are initialized to 1 and 2, respectively, 
        // to represent the number of ways to climb 1  and 2 steps.
        a[0] = 1;
        a[1] = 2;

        // The code then loops through the array, starting from the third element,
        // and updates the number of ways to climb the stairs at each step as 
        // the sum of the number of ways to climb the previous two steps.
        for(int i = 2 ; i < n ; i++){
            a[i] = a[i-1] + a[i-2];
        }

        // Finally, the code returns the last element of the array, 
        // which is the number of ways to climb the entire staircase with n steps.
        return a[n-1];
    }
}