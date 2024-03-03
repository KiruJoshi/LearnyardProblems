class Solution {
    public int[][] divideArray(int[] nums, int k) {

     Arrays.sort(nums);
     int row=nums.length/3;
     int col=3,index=0;
     int result[][]=new int[row][col];
      for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
              result[i][j]=nums[index];
              index++;
          }
      }  
      for(int j=0;j<row;j++){
         if(result[j][2]-result[j][0]>k){
             return new int[0][0];
         }
      }
      return result;
    }
}
