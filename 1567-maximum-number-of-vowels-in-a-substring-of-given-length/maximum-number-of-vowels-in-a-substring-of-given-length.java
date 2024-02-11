class Solution {

    public int maxVowels(String s, int k) {
        
        int arr[]=new int[128];
        arr['a']=1;
        arr['e']=1;
        arr['i']=1;
        arr['o']=1;
        arr['u']=1;
        System.out.println('a');
        int maxVowels=0;
        int windowVowels=0;
       // String vowels="aeiou";
        for(int i=0;i<k;i++){
            if(arr[s.charAt(i)]==1){
                windowVowels++;
            }
        }
        maxVowels=windowVowels;
        for(int i=k;i<s.length();i++){
            if(arr[s.charAt(i-k)]==1){
                windowVowels--;
            } if(arr[s.charAt(i)]==1){
                windowVowels++;
            }
            maxVowels=Math.max(maxVowels,windowVowels);
            if(maxVowels==k){
                return k;
            }

        }
        return maxVowels;
    }

}