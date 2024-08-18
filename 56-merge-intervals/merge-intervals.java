class Solution {
    public int[][] merge(int[][] intervals) {
        
       // Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));//o(nlog(n))
        //int i = 0, j = 1;//o(1)
        // while(j < n){//o(n)
        //     if(intervals[j][0] <= intervals[i][1]){
        //         intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
        //     } else {
        //         i++;
        //         intervals[i][0] = intervals[j][0];
        //         intervals[i][1] = intervals[j][1];
        //     }
        //     j++;
        // }
        // int ans[][] = new int[i+1][2];//o(1)
        // for(int k=0; k<=i; k++){//o(n)
        //     ans[k][0] = intervals[k][0];
        //     ans[k][1] = intervals[k][1];
        // }
        // return ans;
        
        int n = intervals.length;//o(1)
        int[][] result = new int[n][2];
        
        for (int i = 0; i <n; i++) {
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }
        Arrays.sort(result, (a, b) -> (a[0] - b[0]));
        ArrayList<int[]> list = new ArrayList<>();
         int[][] ans = new int[list.size()][2];
         int i = 0, j = 1;//o(1)
        while (j < n ) {
            if (result[i][1] >= result[j][0]) {// overlapping condition
                result[i][1] = Math.max(result[i][1], result[j][1]);
            } else {
                // Add the merged interval to the list
                list.add(new int[] { result[i][0], result[i][1] });
                i = j;// i=2
            }
            j++;
        }
       // Add the last merged interval to the list
        list.add(new int[] { result[i][0], result[i][1] });

        // Initialize ans array with the correct size
        ans = new int[list.size()][2];
         list.toArray(ans);
        return ans;
    }
}
//Time Complexity-o(nlog(n))
//space complexity = o(n)