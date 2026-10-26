class Solution {
    private int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            max = Math.max(max, num);
        }
        return max;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int start = 0;
        int end = start+k-1;

        ArrayList<Integer> list = new ArrayList<>();

        while(end<nums.length){

            int max = findMax(Arrays.copyOfRange(nums, start, end+1));
            System.out.println(max);

            list.add(max);
            start++;
            end++;
        }

        int len = list.size();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = list.get(i);
        }

        return arr;


    }
}
