class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return countPaths(0, 0, m, n, dp);
    }
    
    public int countPaths(int i, int j, int m, int n, int[][] dp) {
        if(i == m-1 || j == n-1)
            return 1;
        if(i >= m || j >= n)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = countPaths(i+1, j, m, n, dp) + countPaths(i, j+1, m, n, dp);
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