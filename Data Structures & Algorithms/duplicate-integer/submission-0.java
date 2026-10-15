class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > 1) {
                return true;
            }
        }

        return false;
    }
}