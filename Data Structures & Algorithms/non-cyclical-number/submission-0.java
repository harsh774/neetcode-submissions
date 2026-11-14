class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();

    public boolean isHappy(int n) {
        int number = n;
        int square = 0;

        if(map.containsKey(number)){
            return false;
        }

        map.put(number, 1);
        while(number!=0){
            int reminder = number%10;
            square += reminder*reminder;
            number /= 10;
        }

        if(square == 1){
            return true;
        }

        return isHappy(square);

    }
}
