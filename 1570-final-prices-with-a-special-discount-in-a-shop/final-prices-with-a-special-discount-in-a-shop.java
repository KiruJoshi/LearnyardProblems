class Solution {
    public int[] finalPrices(int[] prices) {
        
         int n= prices.length;
       int result[]=new int[n];
      
       for(int i=0;i<n-1;i++){
        for(int j=1+i;j<n;j++){
            if(prices[j] <= prices[i]){
                prices[i]=prices[i]-prices[j];
                break;
            }
          }
       } 

       return prices;
    }
}