class Solution {
    public boolean isSubsequence(String s, String t) {
        
        StringBuilder str=new StringBuilder();
        int m=s.length();
        int n = t.length();
        int i=0,j=0;
         while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
                str.append(s.charAt(i));
                i++;
                j++;
            } else {
                j++;
            }
         }
           if(str.toString().equals(s)){
            return true;
           }
        return false;
    }
}