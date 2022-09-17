class Solution {
    //using dp- bottom up approach
    public int numDecodings(String s) {
        int[] dp = new int[102];                
        Arrays.fill(dp, 0);
        int n = s.length();
        int op2 = 0;
        dp[n+1] = 1;                                //because for i>=s.length(), we were returning 1
        dp[n] = 1;
        for(int i = n-1; i>=0; i--) {
            int op1 = s.charAt(i)-'0';
            if(i < s.length()-1) {
                op2 = op1*10 + s.charAt(i+1)-'0';
            }
            if(op1 > 0)
                dp[i] += dp[i+1];
            if(op1 > 0 && op2 > 0 && op2 <= 26)
                dp[i] += dp[i+2];
        }
        return dp[0];
    }
}


//using recursion
//     public int numDecodings(String s) {              
//         return help(0, s);                      //starts with index 0
//     }
    
//     public int help(int i, String s) {
//         if( i >= s.length())                    //when i index reached to end of string, means we have found a way so return 1
//             return 1;
        
//         int ans = 0, op2 = 0;           
//         int op1 = s.charAt(i) - '0';            //with give 1st char as integer ex 1 from 1234
//         if(i < s.length()-1) {                  //for making op2, there should be 2 digit, so we are checking with size-1
//             op2 = op1*10 + s.charAt(i+1)-'0';
//         }
//         if(op1 > 0)                     
//             ans += help(i+1, s);                //i+1 because we have taken 1 digit
//         if(op1 > 0 && op2 > 0 && op2 <= 26)     //bcz we do not consider number like 06
//             ans += help(i+2, s);                //i+2 because we have taken 2 digits
//         return ans;
//     }

//----------------------------------
//     //using memoization- Top down approach
//     public int numDecodings(String s) {
//         int[] dp = new int[101];                //constraint given as 100
//         Arrays.fill(dp, -1);
//         return help(0, s, dp);                      //starts with index 0
//     }
    
//     public int help(int i, String s, int[] dp) {
//         if( i >= s.length())                    //when i index reached to end of string, means we have found a way so return 1
//             return 1;
        
//         if(dp[i] != -1)
//             return dp[i];
        
//         int ans = 0, op2 = 0;           
//         int op1 = s.charAt(i) - '0';            //with give 1st char as integer ex 1 from 1234
//         if(i < s.length()-1) {                  //for making op2, there should be 2 digit, so we are checking with size-1
//             op2 = op1*10 + s.charAt(i+1)-'0';
//         }
//         if(op1 > 0)                     
//             ans += help(i+1, s, dp);                //i+1 because we have taken 1 digit
//         if(op1 > 0 && op2 > 0 && op2 <= 26)     //bcz we do not consider number like 06
//             ans += help(i+2, s, dp);                //i+2 because we have taken 2 digits
//         return dp[i] = ans;
//     }