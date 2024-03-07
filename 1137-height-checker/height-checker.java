class Solution {
    public int heightChecker(int[] heights) {

      int expected[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        int count=0;
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
               count++;
            }
        }
        return count;
    }
}