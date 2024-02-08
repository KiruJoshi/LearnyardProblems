class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        int sum_of_first=0, sum_of_second=0,sum_of_target=0;
        char[] charArray = new char[26];
        for(int i=0;i<=charArray.length;i++){

        }
        charArray[0]='a';
        int count=0;//acb
         int value=0;
        for(int i=0;i<firstWord.length();i++){//0-2
       
              value=Integer.valueOf(firstWord.charAt(i))-97;
              sum_of_first=(sum_of_first*10)+value;
        
        } for(int i=0;i<secondWord.length();i++){
            value=Integer.valueOf(secondWord.charAt(i))-97;
                sum_of_second=(sum_of_second*10)+ value;
            }

       int sum_of_two=sum_of_first+sum_of_second;

        for(int i=0;i<targetWord.length();i++){
            value=Integer.valueOf(targetWord.charAt(i))-97;
                sum_of_target= (sum_of_target*10)+value;
            }
         if(sum_of_two==sum_of_target){
            return true;
        }
        return false;
    }
}
