class Solution {
    public void sortColors(int[] nums) {
    //1-pass solution
    int p1 = 0, p2 = nums.length-1;
        for(int i=0; i<=p2; i++) {      //use i<=p2 here, not nums.length-1, bczp2 will decreement, we have to check upto there only
            if(nums[i] == 0) {
                nums[i] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if(nums[i]  == 2) {
                nums[i] = nums[p2];
                nums[p2] = 2 ;
                p2--;
                i--;
            }
        }
    }
}

//2-pass solution
// public void sortColors(int[] nums) {
//         int count0 = 0, count1 = 0, count2 = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {count0++;}
//             if (nums[i] == 1) {count1++;}
//             if (nums[i] == 2) {count2++;}
//         }
//         for(int i = 0; i < nums.length; i++) {
//             if (i < count0) 
//                 nums[i] = 0;
//             //count0 + count1 bcz i will be increatented upto count0(int if condition) and will not start from 0, for count2(else if)
//             else if (i <  count0 + count1) {    
//                 nums[i] = 1;}
//             else 
//                 nums[i] = 2;
//         }
//     }