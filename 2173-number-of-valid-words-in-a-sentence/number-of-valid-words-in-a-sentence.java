class Solution {
    // Check if the word contains any digits
    public boolean checkDigit(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    // Check if the word contains a valid hyphen
    public boolean checkHyphen(String word) {
        int hyphenCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '-') {
                hyphenCount++;
                if (hyphenCount > 1) {
                    return false;
                }
                if (i == 0 || i == word.length() - 1 || !Character.isLowerCase(word.charAt(i - 1)) || !Character.isLowerCase(word.charAt(i + 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if the word contains valid punctuation
    public boolean checkPunctuation(String word) {
        int punctuationCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '!' || ch == ',' || ch == '.') {
                punctuationCount++;
                if (punctuationCount > 1 || i != word.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countValidWords(String sentence) {
        int validCount = 0;
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty() && !checkDigit(word) && checkHyphen(word) && checkPunctuation(word)) {
                validCount++;
            }
        }
        return validCount;
    }
}