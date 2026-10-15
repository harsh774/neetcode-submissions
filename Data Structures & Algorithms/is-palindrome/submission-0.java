class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        char[] revArr = new char[arr.length];  

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[index++] = arr[i];
        }

        return Arrays.equals(arr, revArr);
    }
}