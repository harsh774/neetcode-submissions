class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i<len; i++){
            if(!dq.isEmpty() && (dq.peekFirst() <= i-k)){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && (nums[dq.peekLast()] <= nums[i])){
                dq.removeLast();
            }
            dq.addLast(i);

            if(i>=k-1){
                res.add(nums[dq.peekFirst()]);
            }
        }


        int[] ans = new int[res.size()];

        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
