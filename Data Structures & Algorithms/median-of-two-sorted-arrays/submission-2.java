class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] nums = new int[len1+len2];

        int start1 = 0;
        int start2 = 0;

        int idx = 0;

        while(start1<len1 && start2<len2){
            if(nums1[start1]<=nums2[start2]){
                nums[idx++] = nums1[start1++];
            }else{
                nums[idx++] = nums2[start2++];
            }
        }

        // remaining in nums1

        for(int i = start1; i<len1; i++){
            nums[idx++] = nums1[i];
        }

        //remaining in nums2

        for(int i= start2; i<len2; i++){
            nums[idx++] = nums2[i];

        }

        int len = len1+len2;
        int mid = len/2;

        if(len%2==0){
            return (nums[mid-1] + (double)nums[mid])/2;
        }

        return nums[mid];

    }
}
