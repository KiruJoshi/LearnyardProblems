class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int maxCount=Integer.MIN_VALUE;
        int ans=0;
        for(int year=1950;year<2050;year++){
            int temp=0;
            for(int i=0;i<logs.length;i++){
              if(year>=logs[i][0] && year<logs[i][1]){
                  temp++; 
              } 
            }
            if(maxCount<temp){
                ans=year;
                maxCount=temp;
            }
        }
        return ans;
    }
}