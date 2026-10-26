class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;

        int[][] cars = new int[len][2];

        Stack<Double> st = new Stack<>();

        Arrays.sort(cars, (a,b)-> Integer.compare(b[0],a[0]));

        for(int i=0; i<len; i++){
            double time = (double) (target-cars[i][0])/cars[i][1];

            if(st.isEmpty() || time > st.peek()){
                st.push(time);
            }
        }
        return st.size();
    }
}
