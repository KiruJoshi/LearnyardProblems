class Solution {
    public int uniquePathsHelper(int m, int n, int dp[][]){
       if(n<=0 || m<=0){
        return 0;
       } if(n==1 && m==1){
            return 1;
       } 
        if(dp[m][n]!=-1){
        return dp[m][n];
       }
       int count1 = uniquePathsHelper(m-1,n,dp);
       int count2 = uniquePathsHelper(m, n-1, dp);

       return dp[m][n] = count1+count2;
    }
    public int uniquePaths(int m, int n) {
       int dp[][]=new int[m+1][n+1]; 
          for(int[] row : dp)
            Arrays.fill(row, -1);
       return uniquePathsHelper(m, n, dp);
    }
}