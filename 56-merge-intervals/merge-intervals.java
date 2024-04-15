class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;//o(1)
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));//o(nlog(n))
        int i = 0, j = 1;//o(1)
        while(j < n){//o(n)
            if(intervals[j][0] <= intervals[i][1]){
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
            } else {
                i++;
                intervals[i][0] = intervals[j][0];
                intervals[i][1] = intervals[j][1];
            }
            j++;
        }
        int ans[][] = new int[i+1][2];//o(1)
        for(int k=0; k<=i; k++){//o(n)
            ans[k][0] = intervals[k][0];
            ans[k][1] = intervals[k][1];
        }
        return ans;
    }
}
//Time Complexity-o(nlog(n))
//space complexity = o(n)