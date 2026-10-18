class Solution {
    public int mulOfNonZero(int[] nums, boolean allowZero) {
        int product = 1;

        for (int num : nums) {
            if (allowZero && num == 0) {
                product *= num;
            }
            if (num != 0) {
                product *= num;
            }
        }

        if(product == 1){
            return 0;
        }

        return product;
    }
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = mulOfNonZero(nums, false);
            } else {
                res[i] = mulOfNonZero(nums, true) / nums[i];
            }
        }

        return res;
    }
}
