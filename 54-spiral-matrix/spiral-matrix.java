class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int N = matrix.length;//3 row
        int M = matrix[0].length;//3 col
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (N > 0 && M > 0)
        {
            // Edge Case
            if (M == 1)  // Only one Column
            {
                for (int l=0; l<N; l++)
                {
                    ans.add(matrix[i][j]);
                    i++;
                }

                return ans;
            }
            if (N == 1)  // Only one Row
            {
                for (int l=0; l<M; l++)
                {
                    ans.add(matrix[i][j]);
                    j++;
                }
                //break;
                return ans;
            }
            // Iterate M-1 times from L -> R
            for (int l=1; l<M; l++)
            {
                ans.add(matrix[i][j]);//1 2 
                j++ ;
            }
            // Iterate N-1 times from T -> B
            for (int l=1; l<N; l++)//row iterate
            {
                ans.add(matrix[i][j]);//3,6
                i++ ;//rows increase
            }
            // Iterate M-1 times from R -> L
            for (int l=1; l<M; l++)
            {
                ans.add(matrix[i][j]);//9,8
                j-- ;
            }
            // Iterate N-1 times from B -> T
            for (int l=1; l<N; l++)//1-2
            {
                ans.add(matrix[i][j]);//7,4
                i-- ;//
            }
            i++ ;
            j++ ;
            N = N-2;
            M = M-2;
        }
        return ans;
    }
} 