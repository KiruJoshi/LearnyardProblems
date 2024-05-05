class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean vowels = false, consonent = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels = true;
            }
            if ("bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(ch) != -1) {
                consonent = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }

        return (vowels && consonent);
    }
}
