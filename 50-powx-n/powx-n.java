class Solution {

    double myPowerHelper(double x, int n) {
        if (n == 0)
            return 1.0;
       double partial_ans=  myPowerHelper(x, n/2);
       if(n%2==0){
           return partial_ans*partial_ans;
       }else{
           return partial_ans*partial_ans*x;
       }
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1 / myPowerHelper(x, Math.abs(n));
        } else {
            return myPowerHelper(x, n);
        }

    }
}