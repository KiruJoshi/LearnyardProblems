class Solution {
     public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for(String str: strs){
            if(minLength>str.length()){
                minLength = str.length(); 
            }
        }
        String finalString = "";
        String s = strs[0];
        for(int j=0;j<minLength;j++){
            char c = s.charAt(j);
            boolean contains =true;
            for(int i=1;i<strs.length;i++){
               String st = strs[i];
               if(st.charAt(j) != c){
                 contains = false;
               }
            }
            if(contains){
              finalString+=c;
            }
            else if(!contains){
                break;
            }
        }
        return finalString;
    }
}
