class Solution {
    public int hammingWeight(int n) {
      int count = 0; 
      for(int i =0; i<32;i++){
        if((n&(1<<i))!=0){
            count++;
        }
      }
      return count; 
    }
}
/**
1 2 4 8 12 1
0 1 1 1
11
1 1 0 1-3bits
1111
0111
<<
1110
 */