class Solution {
    //Iterative approach
    //TC: O(n*2^n), 2^n, for no of subsets, n is for numbers in subsets
    //SC: O(n*2^n)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>()); //adding empty sublist
        
        for(int num : nums) {
            int n = ans.size(); //for first iteration, size of list will be one, for empty sublist
            for(int i=0; i<n; i++) {
                List<Integer> temp = new ArrayList<>(ans.get(i));   //copy existing element from the list
                temp.add(num);  //adding current element, in copied list
                ans.add(temp);  //adding copied list into main list
                //see below, for how each iteration worked, '''/ signifies each iteration
                //[[]/ [1]/ [2],[1,2]/ [3],[1,3],[2,3]/ [1,2,3]]
            }
        }
        return ans;
    }
}