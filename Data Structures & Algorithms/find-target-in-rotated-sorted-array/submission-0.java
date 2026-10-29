class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length; 

        int start = 0;
        int end = len-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            // Left sorted array
            if(nums[start]<= nums[mid]){
                if(nums[start]<target && target <= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(nums[end]>nums[mid]){
                if(nums[mid]<target && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }

        return -1;
    }
}
