class Solution {
    //combinatorics approach, striver's approach
    //The time complexity of this solution will be O(n-1) or  O(m-1) depending on the formula we are using.
    //As we are not using any extra space the space complexity of the solution will be  O(1).
    public int uniquePaths(int m, int n) {
        int N = m + n-2;  //no of steps each time, m=3, n=7, n=7+3-2=8
        int r = m-1;    //r=3-1=2
        //int r = n-1;  //any one from m or n would do, we are taking m (m-1)
        double res = 1;
        
        for(int i=1; i<=r; i++) {
            res = res*(N-r+i)/i;    //nCr   7*(8/2)=28
        }
        return (int)res;
    }
}

//******** Recursive Approach, 
//********TC: exponential bcz we are gonna try all possible combinations , SC: as we are using stack space, so exponential
//  public int uniquePaths(int m, int n) {
//         return countPaths(0, 0, m, n);
//     }
    
//     public int countPaths(int i, int j, int m, int n) {
//         if(i == m-1 || j == n-1)
//             return 1;
//         if(i >= m || j >= n)
//             return 0;
//         return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
//     }

//-----------------------------------------------------------------------------------------------------
//******dp approach
//     //******The time complexity of this solution will be O(n*m) because at max there can be n*m number of states.
//     //******As we are using extra space for the dummy matrix the space complexity will also be O(n*m).
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for(int[] row : dp) {
//             Arrays.fill(row, -1);
//         }
//         return countPaths(0, 0, m, n, dp);
//     }
    
//     public int countPaths(int i, int j, int m, int n, int[][] dp) {
//         if(i == m-1 || j == n-1)
//             return 1;
//         if(i >= m || j >= n)
//             return 0;
//         if(dp[i][j] != -1)
//             return dp[i][j];
//         return dp[i][j] = countPaths(i+1, j, m, n, dp) + countPaths(i, j+1, m, n, dp);
//     }