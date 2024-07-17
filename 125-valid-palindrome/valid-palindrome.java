class Solution {
    public boolean checkAlphanumeric(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        String test = s.toLowerCase();
        int n = s.length();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (checkAlphanumeric(test.charAt(i)))
                str.append(test.charAt(i));
        }
        String temp = str.toString();
        StringBuilder toTest = str.reverse();
        System.out.println("temp =" + temp + "  toTest=" + toTest);

        return temp.equals(toTest.toString());

    }
}