class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int maxLen = 0;
        int left = 0; int right = 0;

        while(right<s.length()){
            char rightCh = s.charAt(right);
            char leftCh = s.charAt(left);

            if(!set.contains(rightCh)){
                set.add(rightCh);
                maxLen = Math.max(maxLen, set.size());
                right++;
            }else{
                set.remove(leftCh);
                left++;
            }
        }
        return maxLen;
    }
}
