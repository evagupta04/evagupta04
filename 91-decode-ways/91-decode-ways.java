class Solution {
    //using memoization- Top down approach
    public int numDecodings(String s) {
        int[] dp = new int[101];                //constraint given as 100
        Arrays.fill(dp, -1);
        return help(0, s, dp);                      //starts with index 0
    }
    
    public int help(int i, String s, int[] dp) {
        if( i >= s.length())                    //when i index reached to end of string, means we have found a way so return 1
            return 1;
        
        if(dp[i] != -1)
            return dp[i];
        
        int ans = 0, op2 = 0;           
        int op1 = s.charAt(i) - '0';            //with give 1st char as integer ex 1 from 1234
        if(i < s.length()-1) {                  //for making op2, there should be 2 digit, so we are checking with size-1
            op2 = op1*10 + s.charAt(i+1)-'0';
        }
        if(op1 > 0)                     
            ans += help(i+1, s, dp);                //i+1 because we have taken 1 digit
        if(op1 > 0 && op2 > 0 && op2 <= 26)     //bcz we do not consider number like 06
            ans += help(i+2, s, dp);                //i+2 because we have taken 2 digits
        return dp[i] = ans;
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

