class Solution {
    List<String> ans = new ArrayList<String>();
    
    public List<String> generateParenthesis(int n) {
        String output = "";
        if(n == 0)
            return ans;
        solve(n, n, "");
        return ans;
        
    }
    
    public void solve(int open, int close, String output) {
        if(open == 0 && close == 0) {
            ans.add(output);
            return;
        }
        if(open != 0) {
            solve(open-1, close, output + "(");
            
        }
        if(close > open) {
            solve(open, close-1, output + ")"); 
        }
    }
}