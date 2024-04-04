class Solution {

     public int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    public boolean hasGroupsSizeX(int[] deck) {

       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0;i<deck.length;i++)
        map.put(deck[i],map.getOrDefault(deck[i],0)+1);
       int gcd = 0;
       for(int ele:map.values())
            gcd = gcd(gcd, ele);
        if(gcd>1)
            return true;
       return false; 
    }
}