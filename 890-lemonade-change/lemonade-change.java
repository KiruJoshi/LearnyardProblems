class Solution {
    public boolean lemonadeChange(int[] bills) {
        
       int five_count=0,ten_count=0;
       for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
            five_count++;
        }else if(bills[i]==10){
            if(five_count>0){
                five_count--;
                ten_count++;
            } else {
                return false;
            }
        } else{
            if(five_count>0 && ten_count>0){
                five_count--;
                ten_count--;
            } else if(five_count>2){
                five_count-=3;
            } else{
                return false;
            }
        }
       } 
       return true;
    }
}