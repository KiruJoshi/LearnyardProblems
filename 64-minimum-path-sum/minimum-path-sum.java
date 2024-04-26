class Solution {
    public int minPathSumHelper(int m, int n, int[][] grid, int[][] dp){
        
        if(n>= grid[0].length || m>=grid.length){
        return 100000;//10^5
       }
        if(n==grid[0].length-1 && m==grid.length-1){
            return grid[m][n];
       } 
        if(dp[m][n]!=-1){
        return dp[m][n];
       }

       int count1 = minPathSumHelper(m+1, n, grid, dp);//down
       int count2 = minPathSumHelper(m, n+1, grid, dp);//right

        return dp[m][n] = grid[m][n] + Math.min(count1, count2);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][]=new int[m+1][n+1]; 
        for(int[] row : dp)
            Arrays.fill(row, -1);
        return  minPathSumHelper(0, 0, grid,dp) ;    
    }
}