class Solution {
    public boolean checkRotate(String s, String goal){
        StringBuilder str=new StringBuilder();
        int size=s.length();
        while(size-->0){
            for(int i=1;i<s.length();i++){
                str.append(s.charAt(i));
            }
            str.append(s.charAt(0));
            if(str.toString().equals(goal)){
                return true;
            }
            s=str.toString();
            str.setLength(0);
        }
        return false;   
    }
    public boolean rotateString(String s, String goal) {
      return checkRotate(s,goal);
    }
}
