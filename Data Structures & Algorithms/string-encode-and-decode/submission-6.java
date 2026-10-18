class Solution {

    public String encode(List<String> strs) {
    if (strs.isEmpty()) return "";
    return "#" + String.join("_", strs);   // "#" marks a non-empty list
}

public List<String> decode(String str) {
    if (str.isEmpty()) return new ArrayList<>();
    return Arrays.asList(str.substring(1).split("_", -1));
}
}
