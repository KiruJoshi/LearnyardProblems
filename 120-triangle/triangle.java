class Solution {
    public int minPathSumHelper(int m, int n, List<List<Integer>> triangle, int dp[][]){
        if(m == triangle.size()-1){
            return triangle.get(m).get(n);
        }
        if(dp[m][n]!=-1){
        return dp[m][n];
       }
       int ans1= minPathSumHelper(m+1,n,triangle, dp);
       int ans2 = minPathSumHelper(m+1,n+1,triangle, dp);
        return dp[m][n] = triangle.get(m).get(n) + Math.min(ans1, ans2);

    }
    public int minimumTotal(List<List<Integer>> triangle) {
       int m = triangle.size();
        int dp[][]=new int[m+1][m+1]; 
        for(int[] row : dp)
            Arrays.fill(row, -1);
          //we are going last index  
        return  minPathSumHelper(0, 0, triangle,dp) ;    
    }   
    }
