class Solution {
    //Space Optimization
    //TC: O(N), We are running a simple iterative loop
    //SC: O(1): We are not using any extra space
    public int fib(int n) {
        int prev1 = 0;
        int prev2 = 1;
        if(n == 0)  return 0;
        
        for(int i=2; i<=n; i++) {
            int cur_idx = prev1 + prev2;
            prev1 = prev2;
            prev2 = cur_idx;
        }
        return prev2;
    }
}


//*********recursion
// public int fib(int n) {
//     if(n <= 1)
//         return n;
//     else 
//         return fib(n-1) + fib(n-2);
// }

//**********memoization Top down
//TC: The overlapping subproblems will return the answer in constant time O(1). Therefore the total number of new subproblems we solve is ‘n’. Hence total time complexity is O(N)
//SC:  We are using a recursion stack space(O(N)) and an array (again O(N)). Therefore total space complexity will be O(N) + O(N) ≈ O(N)
//     public int fib(int n) {
//         int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         return fib(n,dp);
//     }
    
//     public int fib(int n, int[] dp) {
//         if(n <= 1)
//             return n;
//         if(dp[n] != -1)
//             return dp[n];
//         else
//             return dp[n] = fib(n-1, dp) + fib(n-2, dp);
//     }


//********Tabulation, Bottom up, giving Array Index Out of Bound, for length 1 :(
    //TC: O(N), We are running a simple iterative loop
    //SC: O(n): We are using an external array of size ‘n+1’.
    // public int fib(int n) {
    //     int[] dp = new int[n+1];
    //     Arrays.fill(dp, -1);
    //     dp[0] = 0;
    //     dp[1] = 1;
    //     for(int i=2; i<=n; i++) {
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }