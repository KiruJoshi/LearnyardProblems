class Solution {
    public int minPathSumHelper(int m, int n, int[][] grid, int[][] dp){
        
        if(n<0 || m<0){
        return 100000;//10^5
       }
        if(n==0 && m==0){
            return grid[m][n];
       } 
        if(dp[m][n]!=-1){
        return dp[m][n];
       }

       int count1 = minPathSumHelper(m-1, n, grid, dp);//down
       int count2 = minPathSumHelper(m, n-1, grid, dp);//right

        return dp[m][n] = grid[m][n] + Math.min(count1, count2);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][]=new int[m+1][n+1]; 
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return  minPathSumHelper(m-1, n-1, grid,dp) ;    
    }
}