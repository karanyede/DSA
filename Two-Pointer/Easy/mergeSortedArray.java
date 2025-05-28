class Solution {
   public void merge(int[] nums1, int m, int[] nums2, int n) {
        //First take 3 pointers and assign with the below values
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        //Compare the elements and replace the end index of num1 with the greater element
        //Decrement the end index as well as the pointer with greater index
        //continue the loop untill pointer p2 becomes 0
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }
}
