class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(i >= 0)
            nums1[k--] = nums1[i--];
        while(j >= 0)
            nums1[k--] = nums2[j--];
    }
}


//solution with extra space, wont be submitted as we need to do this in place in nums1
//TC: O(n) (may be)
//SC: O(m+n)
// public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] arr = new int[m+n];
//         int i=0, j=0, k=0;
//         while(i < m && j < n) {
//             if(nums1[i] <= nums2[j]) {
//                 arr[k]=nums1[i];
//                 i++;
//                 k++;
//             }
//             else {
//                 arr[k]=nums2[j];
//                 j++;
//                 k++;
//             }
//         }
//         while(i <m-n)
//             arr[k++] = nums1[i++];
//         while(j < n)
//             arr[k++] = nums2[j++];
//          for(int x : arr)
//          System.out.println(x);
//     }