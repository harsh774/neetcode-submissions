class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
 Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            char[] chr = str.toCharArray();

            Arrays.sort(chr);

            String key = new String(chr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }
}
