
class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 < len2) return "";

        int[] freqArr = new int[128];

        for (char ch : t.toCharArray()) {
            freqArr[ch]++;
        }

        int sIndex = -1;
        int minWindow = Integer.MAX_VALUE;

        int count = 0;

        int i = 0;
        int j = 0;

        while (j < len1) {

            char ch = s.charAt(j);

            if (freqArr[ch] > 0) {
                count++;
            }

            freqArr[ch]--;

            while (count == len2) {

                if (j - i + 1 < minWindow) {
                    minWindow = j - i + 1;
                    sIndex = i;
                }

                char leftChar = s.charAt(i);

                freqArr[leftChar]++;

                if (freqArr[leftChar] > 0) {
                    count--;
                }

                i++;
            }

            j++;
        }

        return sIndex == -1 ? "" :
            s.substring(sIndex, sIndex + minWindow);
    }
}
