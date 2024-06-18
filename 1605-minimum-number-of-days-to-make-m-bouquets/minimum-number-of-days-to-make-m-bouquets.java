class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // edge case
        if( (m*k) > bloomDay.length || m>bloomDay.length) return -1;

        int start =Integer.MAX_VALUE , end =Integer.MIN_VALUE;
        for(int ele : bloomDay){
            start = Math.min(start , ele);
            end = Math.max(end , ele);
        }
     
        while(start <= end){
            int mid = (start + end) /2;
            if(isPossible(mid,bloomDay,m,k)){
                end = mid-1;
            }else
               start = mid+1;
          //  System.out.println("-----------");
        }
        return start;
    }
    public boolean isPossible(int days , int [] bloomday , int m , int k){
        int count =0 , bq=0;
        for(int ele : bloomday){
            if(days >= ele){
                count++;
            }
           else{
                bq += (count/k);
                count =0;
            }
         //   System.out.println(count + " "+bq);
        }
        bq += count /k;
        return (bq >= m) ? true : false;
    }
}