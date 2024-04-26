class Solution {
    public int palindromeHelper(int i, int j, String s, int dp[][]) {
        if (i == j) {
            return 1;
        }
        if (i > j) {
            return 0;
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        int count = 0;
        if (s.charAt(i) == s.charAt(j))
            count = 2 + palindromeHelper(i + 1, j - 1, s, dp);
        int poss1 =   palindromeHelper(i + 1, j, s, dp);

        int poss2 = palindromeHelper(i, j - 1, s, dp);

        return dp[i][j] = Math.max(count, Math.max(poss1, poss2));

    }

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return palindromeHelper(0, n - 1, s, dp);
    }
}