class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] nums = new int[len1+len2];

        int start = 0;
        int idx = 0;

        while(start<len1 && start<len2){
            if(nums1[start]<=nums2[start]){
                nums[idx++] = nums1[start];
                nums[idx++] = nums2[start];
            }else{
                nums[idx++] = nums2[start];
            }
        }
    }
}
