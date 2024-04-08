class Solution {
    public List<String> commonChars(String[] words) {

      ArrayList<String> list=new ArrayList<>();
      int n=words.length;
      
      for(char i='a';i<='z';i++){
       int minElement=Integer.MAX_VALUE;
       for(int k=0;k<words.length;k++){
        int count=0;
        for(int j=0;j<words[k].length();j++){
               if(words[k].charAt(j)==i){
                count++;
               }   
        }
        minElement=Math.min(count,minElement);
       }
       for(int m=0;m<minElement;m++){
       list.add(String.valueOf(i));
       }
      }
      
       return list;
    }
}