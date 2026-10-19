class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int start = 0;
        int end = len-1;

        int maxArea = 0;

        while(start<end){
            int width = end-start;

            int height = Math.min(heights[start], heights[end]);

            int area = height * width;
            maxArea = Math.max(maxArea,area);

            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }

        }
        return maxArea;
    }
}
