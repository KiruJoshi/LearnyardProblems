class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i=num1.length()-1, j=num2.length()-1;
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        while(j>=0){
            StringBuilder ans= new StringBuilder();
            int carry=0;
            for(int k=j+1;k<num2.length();k++){
                ans.append('0');
            }
            for(int k=i;k>=0;k--){
                carry+=(num2.charAt(j)-'0')*(num1.charAt(k)-'0');
                ans.append((char) (carry % 10 + '0'));// 3
                carry = carry / 10;
            }   
            if(carry>0){
               ans.append((char) (carry % 10 + '0'));
            } 
            ans.reverse();
            result=new StringBuilder(addStrings(result.toString(),ans.toString()));
            j--;
        }
       
        return result.toString();
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (i >= 0 && j >= 0) {
            carry += (num1.charAt(i) - '0') + (num2.charAt(j) - '0');// 13

            ans.append((char) (carry % 10 + '0'));// 3
            carry = carry / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            carry += (num1.charAt(i) - '0');// 13
            ans.append((char) (carry % 10 + '0'));// 3
            carry = carry / 10;
            i--;
        }
        while (j >= 0) {
            carry += (num2.charAt(j) - '0');// 13
            ans.append((char) (carry % 10 + '0'));// 3
            carry = carry / 10;
            j--;
        }
        if (carry > 0) {
            ans.append((char) (carry % 10 + '0'));// 3
        }
        return ans.reverse().toString();
    }
}