class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<len; i++){
            int tempe = temperatures[i];

            while(!st.isEmpty() && tempe>temperatures[st.peek()]){
                int index = st.pop();

                res[index] = i-index;
            }
            st.push(i);
        }
        return res;
    }
}
