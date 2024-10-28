class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;// o(1)
        int[][] result = new int[n][2];

        for (int i = 0; i < n; i++) {
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }
        Arrays.sort(result, (a, b) -> (a[0] - b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int ans[][] = new int[list.size()][2];
     
        int i = 0, j = 1;
        /**
        (1,7) (2,6)
        (1,6)
         */
        while (j < n) {
            if (result[i][1] >= result[j][0]) {
                result[i][1] = Math.max(result[i][1], result[j][1]);
            } else {
                list.add(new int[] { result[i][0], result[i][1] });
                i = j;
            }
            j++;
        }
        list.add(new int[] { result[i][0], result[i][1] });
        ans = new int[list.size()][2];
        list.toArray(ans);

        return ans;
    }
}

/**
1,3 2,6 5,10 15,18
(1,6),(5,10), (15,18)
(1,10)(15,18)
2,6
 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
 -----(1,3) (1,6)
    --------(2,6)
 */