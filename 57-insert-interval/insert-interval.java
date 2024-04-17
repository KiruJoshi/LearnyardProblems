class Solution {
    public static int[][] merge(int[][] result) {
      int i=0,j=1;
      int n = result.length;
      ArrayList<int[]> list = new ArrayList<>();
      int[][] ans=new int[list.size()][2];
      while(j<n){
       if(result[i][1]>=result[j][0]){
       result[i][1]=Math.max(result[i][1],result[j][1]);
       }else {
            // Add the merged interval to the list
            list.add(new int[]{result[i][0], result[i][1]});
            i = j;
        }
       j++;
      }
      // Add the last merged interval to the list
    list.add(new int[]{result[i][0], result[i][1]});
    
    // Initialize ans array with the correct size
    ans = new int[list.size()][2];  
     for (int k = 0; k < list.size(); k++) {
        ans[k][0] = list.get(k)[0];
        ans[k][1] = list.get(k)[1];
      }
      return ans;
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<Integer> list = new ArrayList<>();
        int n = intervals.length;
        int[][] result = new int[n + 1][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }
        result[n][0] = newInterval[0];
        result[n][1] = newInterval[1];
        Arrays.sort(result, (a, b) -> (a[0] - b[0]));
        return merge(result);
    }
}
