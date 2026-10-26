class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxBanana = Integer.MIN_VALUE;

        for(int banana: piles){
            if(banana > maxBanana){
                maxBanana = banana;
            }
        }

        int left = 1;
        int res = Integer.MAX_VALUE;

        while(left<=maxBanana){
            int mid = left+(maxBanana-left)/2;

            int totalHours = 0;
            for(int i=0; i<piles.length; i++){
                totalHours += Math.ceil((double)piles[i]/mid);
            }

            if(totalHours > h){
                left = mid+1;
            }else{
                res = mid;
                maxBanana = mid-1;
            }
        }
        return res;
    }
}
