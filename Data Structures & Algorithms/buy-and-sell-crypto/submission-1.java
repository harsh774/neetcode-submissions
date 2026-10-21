class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 

        int start = 0;
        int end = n-1;

        int profit = 0;

        int leftMin = Integer.MAX_VALUE;
        int rightMax = 0;

        while(start<=end){
            leftMin = Math.min(leftMin, prices[start]);
            rightMax = Math.max(rightMax, prices[end]);
            
            int currentProfit = rightMax - leftMin;
            profit = Math.max(currentProfit, profit);
            start++;
            end--;
        }
        return profit;
    }
}
