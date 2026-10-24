class Solution {

    private int evaluate(int a, int b, String operation){
        switch(operation){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return (int) a/b;
        }
        return -1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            if(str.equals( "+") || str.equals("-") || str.equals("*") || str.equals("/")){
                int b = st.pop();
                int a = st.pop();

                int res = evaluate(a,b,str);
                st.push(res);
            }else{
                st.push(Integer.parseInt(str));
            }
        }
        return st.peek();
    }
}
