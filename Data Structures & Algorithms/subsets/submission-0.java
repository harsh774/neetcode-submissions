class Solution {
    private void findSubsets(int[] nums, List<List<Integer>> res, int idx, List<Integer> curr) {
        if(idx == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        // Take curr idx element
        curr.add(nums[idx]);
        findSubsets(nums, res, idx+1, curr);

        // Remove and backtract curr idx element
        curr.remove(curr.size()-1);

        // Don't take curr idx
        findSubsets(nums, res, idx+1, curr);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findSubsets(nums, res, 0, new ArrayList<Integer>());
        return res;
    }
}
