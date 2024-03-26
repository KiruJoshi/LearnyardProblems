class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

     int result[]=new int[2];
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
        }
     }  
     int n=grid.length;
     for(int i=0;i<=n*n;i++){
      int count = map.getOrDefault(i, 0);
       if(count==2){
        result[0]=i;
       }
       if(count==0){
        result[1]=i;
       }
      }
      return result;
    }
}