class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        int maxLen = 0;
        int left = 0;

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);

            left = Math.max(maxLen, lastIndex[ch]);
            lastIndex[ch] = right+1;
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
