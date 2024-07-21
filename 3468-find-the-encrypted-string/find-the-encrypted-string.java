class Solution {
    public String getEncryptedString(String s, int k) {
       StringBuilder strBuild=new StringBuilder();
       int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
             int temp=(i+k)%n;
             strBuild.append(s.charAt(temp));
        }
        return strBuild.toString();
    }
}