class Solution {
    private boolean isValidAnagram(String s1, String s2) {
        char[] st1 = s1.toCharArray();
        char[] st2 = s2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        return Arrays.equals(st1, st2);
    }
    private boolean checkContains(String str, List<List<String>> listString) {
        for (List<String> list : listString) {
            for (String item : list) {
                if (item.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String currentStr = strs[i];
            List<String> groupAnagrams = new ArrayList<>();
            if (!checkContains(currentStr, res)) {
                groupAnagrams.add(currentStr);

                for (int j = i + 1; j < strs.length; j++) {
                    if (isValidAnagram(currentStr, strs[j])) {
                        groupAnagrams.add(strs[j]);
                    }
                }
                res.add(groupAnagrams);
            }
        }
        return res;
    }
}
