class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        ArrayList<Integer> res = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            max = Math.max(max, nums[i]);
        }

        res.add(max);
        for(int i=0; i<nums.length-k; i++){
            int j = i+k;
            if(nums[j]>max){
                res.add(nums[j]);
                max = nums[j];
            }else{
                res.add(max);
            }
        }

        int[] ans = new int[res.size()];

        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
