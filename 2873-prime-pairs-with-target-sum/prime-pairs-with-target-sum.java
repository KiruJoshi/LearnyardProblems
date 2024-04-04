class Solution {
 public static int[] primeSieve(int n) {
        int isPrime[] = new int[n + 1]; // [0, n]
        Arrays.fill(isPrime, 1);
        
        isPrime[0] = isPrime[1] = 0;
        for(int i = 2; i*i <= n; ++i) {
            if(isPrime[i]==0)
                continue;
            for(int j = i*i; j <= n; j+=i)
                isPrime[j] = 0;
        }
        return isPrime;
    }
    public List<List<Integer>> findPrimePairs(int n) {
      int arr[]=primeSieve(n);
      List<List<Integer>> list=new ArrayList<>();
      for(int i=2;i<=n/2;i++) {
        if(arr[i]==1 && arr[n-i]==1){
             List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add((n-i));
                list.add(pair);
        }
      } 
      return list;
    }
}