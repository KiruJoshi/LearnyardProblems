class Solution {
    public boolean checkValidString(String s) {

        int openBraces = 0, closedBraces = 0;
        int i = 0, len = s.length();
        while ( i < len ) {
            char ch = s.charAt(i);
            char chRev = s.charAt(len - i - 1);
            if ( ch == '(' || ch == '*' )
                openBraces++;
            else openBraces--;
            if ( chRev == ')' || chRev == '*' )
                closedBraces++;
            else closedBraces--;
            if ( openBraces < 0 || closedBraces < 0 ) 
                return false;

            i++;
        }
        return true;
    }
}