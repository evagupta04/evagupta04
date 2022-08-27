class Solution {
    int[][] dp = new int[51][51];
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        for(int[] a : dp) {
            Arrays.fill(a, -1);
        }
        return solve(values, 1, values.length-1);
    }
    
    public int solve(int[] arr, int i, int j) {
        if(i>=j)
            return dp[i][j] = 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=i; k<j; k++) {
            int tempAns = solve(arr, i, k) + solve(arr, k+1, j) + (arr[i-1]*arr[k]*arr[j]);
            if(min > tempAns)
                min = tempAns;
        }
        return dp[i][j] = min;
    }
}