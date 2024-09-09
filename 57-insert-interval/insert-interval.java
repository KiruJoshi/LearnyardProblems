class Solution {
    public int[][] merge(int result[][]){
        int i=0,j=1;
        int n=result.length;
        ArrayList<int[]> list = new ArrayList<>();
        int ans[][]=new int[list.size()][2];
        while(j<n){
         if(result[i][1]>=result[j][0]){
            result[i][1]=Math.max(result[i][1],result[j][1]);
         } else{
            list.add(new int[]{result[i][0],result[i][1]});
            i=j;
         }  
         j++;
        }
        list.add(new int[] { result[i][0], result[i][1] });
        ans=new int[list.size()][2];
        list.toArray(ans);

        return ans;
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = intervals.length;
        int result[][] = new int[n + 1][2];
        for (int i = 0; i < intervals.length; i++) {
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }
        result[n][0] = newInterval[0];
        result[n][1] = newInterval[1];
        Arrays.sort(result, (a, b) -> (a[0] - b[0]));
        return merge(result);
    }
}