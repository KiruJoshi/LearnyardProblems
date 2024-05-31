class TrieNode{
    TrieNode[] child=new TrieNode[10];
}
class Solution {
    TrieNode root = new TrieNode();

    public void insert(int num){
    TrieNode current=root;
      String str = String.valueOf(num);
    	for (char ch : str.toCharArray()) {
            	// if this char is not in trie then add
			// else move to childeren of it
            if(current.child[ch-'0']==null)
              current.child[ch-'0']=new TrieNode();  
            current=current.child[ch-'0'];
      }
    }
    public int longestPrefix(int num){
    TrieNode current=root;
      String str = String.valueOf(num);  
        int result=0;
        for (char ch : str.toCharArray()) {
            if(current.child[ch-'0']==null)
             break;
            else
              result++;
             current=current.child[ch-'0'];  
      }
      return result;
    } 
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
      int ans=0;
       for(int ele:arr1)
         insert(ele);
        for(int val:arr2)
        ans=Math.max(ans,longestPrefix(val)); 
        return ans;
    }
}
