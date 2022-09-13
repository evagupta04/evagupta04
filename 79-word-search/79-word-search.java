class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                //if first element in board is matched wit first char of string and its adjacent element are also matched then return true
                if((board[i][j] == word.charAt(0)) && dfs(i, j, board, word, 0))        
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs (int i, int j, char[][] board, String word, int count) {
        if(count == word.length())      //if conditions satisfy, means we have found the result
            return true;
        //board[i][j] != word.charAt(count), i and j are under boundary then check if it is required char or not, if not then return false otherwise proceed
        if(i == -1 || i == board.length || j == -1 || j == board[0].length || board[i][j] != word.charAt(count))    //boundary condition
            return false;
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found = dfs(i+1, j, board, word, count+1) ||
                        dfs(i-1, j, board, word, count+1) ||
                        dfs(i, j+1, board, word, count+1) ||
                        dfs(i, j-1, board, word, count+1);
        board[i][j] = temp;     //store vale back, during backtracking
        return found;
    }
}