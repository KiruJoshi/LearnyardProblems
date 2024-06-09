class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int ans = 0;
        int arr[] = new int[n];
        Arrays.fill(arr, 1);
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        while (k-- > 0) {
            for (int i = 1; i < n; i++) {
                prefix[i] = (prefix[i - 1] + arr[i])%1000000007;
            } 
          arr = Arrays.copyOf(prefix,n);
        }
        return arr[n-1];
    }
}