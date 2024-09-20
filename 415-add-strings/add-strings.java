class Solution {
    public String addStrings(String num1, String num2) {
       StringBuilder result = new StringBuilder(); 
       int i = num1.length()-1;
       int j = num2.length()-1;
       int sum=0;
       while(i>=0 && j>=0){
        sum+=(num1.charAt(i)-'0')+(num2.charAt(j)-'0');
        result.append((char)(sum%10+'0'));
        sum/=10;
        i--; j--;
       } 
       while(i>=0){
        sum+=(num1.charAt(i)-'0');
        result.append((char)(sum%10+'0'));
        sum/=10;
        i--; 
       } 
       while(j>=0){
        sum+=(num2.charAt(j)-'0');
        result.append((char)(sum%10+'0'));
        sum/=10;
        j--;
       } 
        if(sum>0){
            result.append((char)(sum+'0'));
        }
        return result.reverse().toString();
    }
}