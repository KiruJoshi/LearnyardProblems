class Solution {
    
    int LCShelper(String s1, String s2, int l1, int l2, int dp[][]) {
        if(l1 == 0 || l2 == 0)
            return 0;
            //checking base condition
        if(dp[l1][l2] != -1)
            return dp[l1][l2];
            //if both characters are same
        if(s1.charAt(l1-1) == s2.charAt(l2-1))
            return dp[l1][l2] = 1 + LCShelper(s1, s2, l1-1, l2-1 , dp);
        //if  str1 index is not same then we are moving 1 index ahead
        int poss1 = LCShelper(s1, s2, l1-1, l2, dp);

        //if  str2 index is not same then we are moving 1 index ahead
        int poss2 = LCShelper(s1, s2, l1, l2-1, dp);

        return dp[l1][l2] = Math.max(poss1, poss2);
    }
    public int longestCommonSubsequence(String text1, String text2) {
       int  dp[][] = new int[text1.length()+1][text2.length()+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return LCShelper(text1, text2, text1.length(), text2.length(), dp);
    }
}