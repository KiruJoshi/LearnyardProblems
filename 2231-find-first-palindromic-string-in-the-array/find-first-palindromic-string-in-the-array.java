class Solution {

    public String checkPalindromeHelper(String word) {
        StringBuilder strBuild = new StringBuilder(word);
        return strBuild.reverse().toString();
    }

   public String firstPalindrome(String[] words) {
        for (String word : words) {
            String reversedWord = checkPalindromeHelper(word);
            if (word.equals(reversedWord)) {
                return word;
            }
        }
        return "";
    }
}