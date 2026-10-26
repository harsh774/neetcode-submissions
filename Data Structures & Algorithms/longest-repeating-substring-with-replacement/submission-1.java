class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;

        int res = 0;

        for(int right=1; right<s.length(); right++){
            if(s.charAt(left) == s.charAt(right)){
                res++;
            }else{
                if(k>0){
                    res++;
                    k--;
                }else{
                    left++;
                }
            }
        }
        return res++;
    }
}
