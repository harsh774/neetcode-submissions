class Solution {
    public int mulOfNonZero(int[] nums){
         int product = 1;

        for(int num: nums){
            if(num !=0){
          product *= num;}
        }

        return product;



    }
    public int[] productExceptSelf(int[] nums) {
        int product = 1;

        for(int num: nums){
          product *= num;
        }

        int[] res = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                res[i] = mulOfNonZero(nums);
            }else{
                res[i] =  product/nums[i];
            }
        }
        return res;
    }
}  
