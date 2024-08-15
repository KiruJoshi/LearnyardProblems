class Solution {
    public void rotate(int[][] matrix) {
     int N = matrix.length;
        int M = matrix[0].length;

        // Step 1:- To calculate Transpose of matrix[][]
        for (int i=0; i<N; i++)
        {
            for (int j=i; j<M; j++)
            {
                int temp = matrix[i][j];//temp=1,2
                matrix[i][j] = matrix[j][i];//matrix=
                matrix[j][i] = temp;
            }
        }

        // Step 2:- To reverse rows of the transposed matrix 
        for (int i=0; i<N; i++)
        {
            int s = 0;
            int e = M-1;
            while (s < e)
            {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++ ;
                e-- ;
            }
        }
   
    }
}

