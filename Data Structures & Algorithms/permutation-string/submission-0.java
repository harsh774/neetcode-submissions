class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1>len2) return false;

        int[] need = new int[26];
        int[] window = new int[26];
        
        for(int i = 0; i<len1; i++){
            char ch = s1.charAt(i);
            need[ch-'a']++;
        }

        int start = 0;

        for(int end=0; end<len2; end++){
            char ch = s2.charAt(end);
            window[ch-'a']++;

            if(end-start+1 > len1){
                window[s2.charAt(start)-'a']--;
                start++;
            }
            if(end-start+1 == len1 && Arrays.equals(window, need)) {
                return true;
            }
        }
        return false;

    }
}
