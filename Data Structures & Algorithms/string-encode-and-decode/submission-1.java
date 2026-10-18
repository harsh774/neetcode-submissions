class Solution {
    public String encode(List<String> strs) {
        String encoded = "";
        for (int i = 0; i < strs.size(); i++) {
            String str = strs.get(i);

            if (i > 0) {
                encoded += "_";
            }
            encoded += str;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = Arrays.asList(str.split("_"));

        if (decoded.isEmpty()) {
            return Arrays.asList("", "");
        }

        return decoded;
    }
}
