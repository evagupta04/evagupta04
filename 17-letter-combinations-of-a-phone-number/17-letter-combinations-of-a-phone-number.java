class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return ans;
        String output = "";
        String[] letterArray = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        printKey(digits.toCharArray(), output, letterArray);
        return ans;
    }
    
    public void printKey(char[] digits, String output, String[] letterArray) {
        if(digits.length == output.length()) {
            ans.add(output);
            return;
        }
        int len = output.length();
        int n = digits[len]-'0';  //ascii of zero is 48
        for(char letter : letterArray[n].toCharArray()) {
            printKey(digits, output+Character.toString(letter) ,letterArray);
        }
    }
}


