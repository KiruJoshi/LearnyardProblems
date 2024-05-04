class Solution {
    public String reverse(String str) {
        String rverseString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // extracts each character
            rverseString = ch + rverseString; // adds each character in front of the existing string
        }
        return rverseString;
    }

    public String reverseWords(String s) {
        String ch[] = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            String checkString = reverse(ch[i]);
            result.append(checkString + " ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}