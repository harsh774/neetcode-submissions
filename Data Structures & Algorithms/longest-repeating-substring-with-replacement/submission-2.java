class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;

        char[] freq = new char[26];
        int lef = 0;

        for(int left=0, right=0; right<s.length(); right++){
            freq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);

            while(right-left+1 - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            lef = left;

        }

        return s.length() - lef;
    }
}
