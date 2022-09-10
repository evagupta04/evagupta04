class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0; i<nums.length; i++) {
            int element = nums[i];
            if(element >= 1 && element <= n) {
                int chair = nums[i]-1;
                if(nums[chair] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[chair];
                    nums[chair] = temp;
                    i--;
                }
            }
        }
        //after swapping, check which number is missing
        for(int i=0; i<nums.length; i++) {
            if(i+1 != nums[i])
                return i+1;
        }
        return n+1;
    }
}