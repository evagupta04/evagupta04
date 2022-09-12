class Solution {
    public void sortColors(int[] nums) {
    //2-pass
    int count0 = 0, count1 = 0, count2 = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {count0++;}
        if (nums[i] == 1) {count1++;}
        if (nums[i] == 2) {count2++;}
    }
    for(int i = 0; i < nums.length; i++) {
        if (i < count0) {
            nums[i] = 0;}
        else if (i <  count0 + count1) {    //count0 + count1 bcz i will be increatented upto count0(int if condition) and will not start from 0, for count2(else if)
            nums[i] = 1;}
        else {
            nums[i] = 2;}
    }
    }
}