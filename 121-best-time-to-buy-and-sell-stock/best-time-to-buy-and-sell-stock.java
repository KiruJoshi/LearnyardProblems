class Solution {
    public int maxProfit(int[] prices) {
     int current_min=Integer.MAX_VALUE;
     int max_profit=0;
     for(int ele:prices){
        current_min=Math.min(ele,current_min);
        max_profit=Math.max(max_profit,(ele-current_min));
     }
     return max_profit;
    }
}