class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

     int num=x;
      int rem=0,sum=0;
      while(x!=0){
       rem = x%10;
       x=x/10;
       sum=sum+rem; 
    }  
        if(num%sum==0){
            return sum;
        }
        return -1;
    }
}