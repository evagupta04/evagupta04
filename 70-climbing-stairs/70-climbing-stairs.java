class Solution {
    //DP + Optimization
    public int climbStairs(int n) {
        if(n <= 1)
            return 1;
        
        int prev1 = 1;
        int prev2 = 2;
        for(int i=3; i<=n; i++) {
            int cur_val = prev1 + prev2;
            prev1 = prev2;  
            prev2 = cur_val; 
        }
        return prev2; //can't return cur_val, will fail, if input is 2, bcz cur_val will be initializsed to 0 and will return 0
    }
    
    //DP approach
//     public int climbStairs(int n) {
//         int[] dp = new int[n];
//         dp[0] = 0;
//         dp[1] = 1;
//         dp[2] = 2;
        
//         if(n <= 2)
//             return dp[n];
//         for(int i=3; i<=n; i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
}

//********recursiveway, giving TLE
//Complexity : Time: O(2^n) ; Space: O(n)
    // public int climbStairs(int n) {
    //     if(n == 1)
    //         return 1;
    //     if(n == 2)
    //         return 2;
    //     else return climbStairs(n-1) + climbStairs(n-2);
    // }



//**********Recustion + Memorization (Top Down Approach)
//Complexity : Time: O(n) ; Space: O(n)
    // public int climbStairs(int n) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     map.put(1,1);   //for one steop, there will be 1 way
    //     map.put(2,2);   //for two steps, there will be 2 ways
    //     return climbSt(n, map);
    // }
    // public int climbSt(int n, Map<Integer, Integer> map) {
    //     if(map.containsKey(n))
    //         return map.get(n);
    //     map.put(n, climbSt(n-1, map) + climbSt(n-2, map));
    //     return map.get(n);
    // }


//DP, Bottom Up approach
//     public int climbStairs(int n) {
//         if(n <= 1)
//             return 1;
        
//         int[] dp = new int[n+1];
//         dp[1] = 1;
//         dp[2] = 2;
//         for(int i=3; i<=n; i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
    