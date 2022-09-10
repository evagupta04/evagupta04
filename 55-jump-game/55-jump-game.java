class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i=0; i<nums.length; i++) {
            if(reachable < i)
                return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }
} 
//TC: O(n) since we are doing singke traversal
//SC: O(1) since no extra space needed