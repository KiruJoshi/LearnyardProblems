// Link : https://leetcode.com/problems/edit-distance/
// Time : O(N*M)

class Solution {
  
   public int minDistanceHelper(String w1, String w2, int i, int j, int dp[][]) {
        if(i == w1.length())
            return w2.length() - j; // Base Case 1
        if(j == w2.length())
            return w1.length() - i; // Base Case 2
        if(dp[i][j] != -1)
            return dp[i][j]; // Memoize

        if(w1.charAt(i) == w2.charAt(j)) // Equality case
            return dp[i][j] = minDistanceHelper(w1, w2, i + 1, j + 1, dp);

        // Insert
        int possIns = 1 + minDistanceHelper(w1, w2, i, j + 1, dp);

        // Delete
        int possDel = 1 + minDistanceHelper(w1, w2, i + 1, j, dp);

        // Replace
        int possRep = 1 + minDistanceHelper(w1, w2, i + 1, j + 1, dp);

        return dp[i][j] = Math.min(Math.min(possIns, possDel) , possRep);
    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
       int dp[][] = new int[n][m];
        for(int row[] : dp)
            Arrays.fill(row, -1);
        return minDistanceHelper(word1, word2, 0, 0, dp);
    }
}