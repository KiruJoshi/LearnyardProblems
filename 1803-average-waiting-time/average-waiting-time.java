class Solution {
    public double averageWaitingTime(int[][] customers) {
     double sum=0;
        int j=0;
        int waiting_time[]=new int[customers.length];
        int total_time=0,current_time=0;
      for(int i=0;i<customers.length;i++){
          if(current_time<customers[i][0]){
              current_time=customers[i][0];
          }
          current_time+=customers[i][1];//3
         waiting_time[i]=current_time-customers[i][0];//2,5,6
        
      } 
      float n=(float)waiting_time.length;
      for(int i=0;i<n;i++){
          sum+=waiting_time[i];
      }  
        return (sum/n);
    }
}
// 3-1=2
// 8(3+5)-2=6
// 11-3=7    
    