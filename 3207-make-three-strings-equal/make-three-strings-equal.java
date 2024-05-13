class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i=0,j=0,k=0;
        int len1=s1.length(), len2=s2.length(), len3=s3.length();
        for(;i<len1 && j<len2 && k<len3; i++,j++,k++)
        {
            if(s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k))
            {
                continue;
            }
            else
            {
                break;
            }
        }
        return i==0 ? -1 : (len1+len2+len3) - (i+j+k);
    }
}