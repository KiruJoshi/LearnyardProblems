class Solution {
    public  double binarySpeed(int dist[], double mid){
        double result=0.0;
        for(int i=0;i<dist.length;i++){
         if(i!=dist.length-1)
                result += Math.ceil((double) dist[i] / mid);
            else
                result += (dist[i] / mid);
        }
        return result;
    }

    public int minSpeedOnTime(int[] dist, double hour) {

        int lo = 1, hi = 10000000;
        int result =-1;
        while (lo <= hi) {
           int mid = (lo + hi) / 2;
           double speed = binarySpeed(dist, mid);
            if(speed <= hour){
                  result = mid;
                hi = mid - 1;
            }
            else {
                        lo = mid + 1;
            }
        }
        return result;
    }
   
}