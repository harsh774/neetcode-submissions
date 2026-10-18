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
        List<String> decoded = Arrays.asList(str.split("_", -1));

        if (decoded.isEmpty()) {
            return new ArrayList<>();
        }

        return decoded;
    }
}
