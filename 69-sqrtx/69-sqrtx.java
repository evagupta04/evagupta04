class Solution {
    //binary search
    //TC: log(root of x), much better than linear search, log bcz of binary search
    //SC: o(1)
    public int mySqrt(int x) {
        long start =0, end = Integer.MAX_VALUE, ans = 0;
        while(start <= end) {
            long mid = start+(end-start)/2;
            if(mid*mid <= x) {
                ans = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return (int)ans;
    }
}

//linear search
//TC: O(root of x)
//SC: O(1)
// public int mySqrt(int x) {
//         long y =0;
//         while(y*y <= x)
//             y++;
//         return (int)y-1;
//     }