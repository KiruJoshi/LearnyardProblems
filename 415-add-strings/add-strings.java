class Solution {
    public String addStrings(String num1, String num2) {
     
         int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        int sum = 0;
       
        while(i>=0 && j>=0){
            sum+=(num1.charAt(i)-'0')+(num2.charAt(j)-'0');//42
            ans.append((char)(sum%10+'0'));//ans.append(2)
            sum/=10;//4
            i--;
            j--;
        } while(i>=0){
            sum+=(num1.charAt(i)-'0');
            ans.append((char)(sum%10+'0'));
            sum=sum/10;
            i--;
        }while(j>=0){
            sum+=(num2.charAt(j)-'0');
            ans.append((char)(sum%10+'0'));
            sum=sum/10;
            j--;
        }
        if(sum>0){
            ans.append((char)(sum+'0'));
        }
   
        return ans.reverse().toString();
    }
}