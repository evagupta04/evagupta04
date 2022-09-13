class Solution {
    //recursive approach
    //TC: O(n*2^n), 2^n, for no of subsets generated, O(n) is for copying n elements 
    //SC: O(n), we used O(n) space in list, bcz we are modifying same list, we have not expanded it more than n. max expanded for [1,2,3]
    //SC: O(n*2^n), for output generation, if asked in interview, O(2^n), no of subsets generated, O(n) is max size of subset
    //SC: O(n), Recursion space used in stack, equals to height of tree
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), ans);
        return ans;
    }
    
    public void generateSubsets(int index, int[] nums, List<Integer> curList, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(curList)); //[]
        for(int i=index; i<nums.length; i++) {
            curList.add(nums[i]);   //[1]
            generateSubsets(i+1, nums, curList, ans);
            curList.remove(curList.size()-1);
        }
        //[], [1], [1,2], [1,3] [1, 2, 3], in backtrack, all elements will be removed one by one[] (remove)
        //i=0 i<3/ i=1 i<3/ i=2 i<3/ i=3 i<3
        //[2], [2,3], in backtrack[]
        //i=1 i<3/ i=2 i<3/ i=3 i<3
        //[3], in backtrack[]
        //i=2 i<3/ i=3 i<3
        //
        //i=3 i<3
    }
}


//Iterative approach
    //TC: O(n*2^n), 2^n, for no of subsets, n is for numbers in subsets
    //SC: O(n*2^n)
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         ans.add(new ArrayList<>()); //adding empty sublist
        
//         for(int num : nums) {
//             int n = ans.size(); //for first iteration, size of list will be one, for empty sublist
//             for(int i=0; i<n; i++) {
//                 List<Integer> temp = new ArrayList<>(ans.get(i));   //copy existing element from the list
//                 temp.add(num);  //adding current element, in copied list
//                 ans.add(temp);  //adding copied list into main list
//                 //see below, for how each iteration worked, '''/ signifies each iteration
//                 //[[]/ [1]/ [2],[1,2]/ [3],[1,3],[2,3]/ [1,2,3]]
//             }
//         }
//         return ans;
//     }