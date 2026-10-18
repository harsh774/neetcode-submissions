class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            map.put(ch1, map.getOrDefault(ch1,0)+1);
            map.put(ch2, map.getOrDefault(ch2,0)+1);
        }

        for (Map.Entry<Character, Integer> mapSet :
             map.entrySet()) {

            if(mapSet.getValue()%2!=0){
                return false;
            }
        }
        return true;
    }
}
