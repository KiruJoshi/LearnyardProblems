class Solution {
    static int weightHelper(int weights[], int totalCapacity){
        int ans=1,currenWight=0;
       for(int i=0;i<weights.length;i++){
           if(weights[i]+currenWight<=totalCapacity){
             currenWight+=weights[i];  
           } else {
               ans++;
             currenWight=weights[i];    
           }
       } 
       return ans;
    }
    public int shipWithinDays(int[] weights, int d) {
       // Arrays.sort(weights);
        int min=0, max=0;
        for(int i=0;i<weights.length;i++){
         max+=weights[i];  
         min=Math.max(min,weights[i]); 
        }
        while(min<=max){
          int mid=(min+max)/2;
          int days = weightHelper(weights, mid);
          if(days<=d)  max=mid-1;
           else
           min=mid+1;
        }
        return min;
    }
}