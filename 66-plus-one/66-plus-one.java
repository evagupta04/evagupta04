class Solution {
    //TC: O(N), traversing entire array
    //SC: O(1), excluding the return space
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        for(int i=n-1; i>=0; i--) { //traverse right to left
            if(digits[i] <9) {
                digits[i]++;        //if any digit is not 9, then just increate by 1, ex [1,2,4]=[1,2,5], [1,4,9]=[1,5,0]
                break;
            }
            else {
                digits[i] = 0;      //if digit is 9, then make it 0
            }
        }
        if(digits[0] == 0) {        //if digit in like this [ 9,9,9], so to make it [1,0,0,0], we have to insert a 1 at the start
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}