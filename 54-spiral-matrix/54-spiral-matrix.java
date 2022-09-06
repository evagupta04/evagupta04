class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length == 0|| matrix[0].length == 0)
            return ans;
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            //left to right
            for(int i=colBegin; i<=colEnd; i++) {
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            
            //topto bottom
            for(int i=rowBegin; i<=rowEnd;i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            //right to left
            if(rowBegin <= rowEnd) {
                for(int i=colEnd; i>=colBegin; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            
            //down to top
            if(colBegin <= colEnd) {
                for(int i=rowEnd; i>=rowBegin; i--) {
                    ans.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return ans;
    }
}