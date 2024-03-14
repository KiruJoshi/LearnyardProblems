class Solution {
    public String removeTrailingZeros(String num) {

        StringBuilder str=new StringBuilder(num);
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)!='0'){
                break;
               
            } else{
               // System.out.println("StringBuilder "+ str.delete(i,i+1));
                str.delete(i,i+1);
            }
        }
        return str.toString();
    }
}
