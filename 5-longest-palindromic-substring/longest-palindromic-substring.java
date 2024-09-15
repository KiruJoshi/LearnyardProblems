class Solution {
    public boolean checkPalindromic(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            temp.append(str.charAt(i));
        }
        return str.equals(temp.toString());
    }

    public String longestPalindrome(String s) {
        String maxString = "";
         int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j >=i; j--) {
                if(s.charAt(i)==s.charAt(j)){
                String temp = s.substring(i, j + 1);
                if (checkPalindromic(temp))
                    if(temp.length()>max){
                    maxString=temp;
                    max=temp.length();
                    break;
                }
               // System.out.println(maxString);
              }
            }
            if(s.length()-i<max)
             break;
        }
        return maxString;
    }
}