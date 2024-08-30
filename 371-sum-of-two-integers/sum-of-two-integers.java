class Solution {
    public int getSum(int a, int b) {
    int sum=a^b;
    int carry=(a&b)<<1;
     while(carry!=0){
        int temp=sum;
        sum=sum^carry;
        carry=(carry&temp)<<1;
    }
    return sum;
    }
}
/*
 * 2 010 1 001
 * 
 * 2 011
 * 011
 * 3 011
 */
