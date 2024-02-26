class Solution {
    public void setZeroes(int[][] matrix) {

        int rows[] = new int[matrix.length*matrix[0].length];
        int col[] = new int[matrix[0].length*matrix.length];
        Arrays.fill(rows, -1);
        Arrays.fill(col, -1);
        int k=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[k] = i;
                    col[k] = j;
                    k++;
                }
            }
        }
        for(int val:rows){
            if(val!=-1)
            Arrays.fill(matrix[val], 0); 
        }
    for(int i=0;i<col.length;i++){
        for(int j=0;j<matrix.length;j++){
            if(col[i]!=-1){
              matrix[j][col[i]]=0;  
            }
        }
    }
    }
}