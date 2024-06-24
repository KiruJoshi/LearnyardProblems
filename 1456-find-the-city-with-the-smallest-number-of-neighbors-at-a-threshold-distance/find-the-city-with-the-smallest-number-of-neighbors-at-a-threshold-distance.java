class Solution {
    public int belmonford(int src, int distanceThreshold, int n, int[][] edges) {
        int d[] = new int[n];
        int inf = (int) 1e9;
        Arrays.fill(d, inf);
        d[src] = 0;
        for (int i = 0; i < (n - 1); i++) {
            for (int[] e : edges) {
                int u = e[0];
                int v = e[1];
                int w = e[2];
                if (d[v] > d[u] + w) {
                    d[v] = d[u] + w;
                }  if (d[u] > d[v] + w) {
                    d[u] = d[v] + w;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= distanceThreshold) {
                count++;
            }
        }
       // System.out.println("src " + src + " " + Arrays.toString(d));
        return count;
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int min_Count = Integer.MAX_VALUE;
        int node = 0;
        for (int i = 0; i < n; i++) {
            int count = belmonford(i, distanceThreshold, n, edges);
            if (count <= min_Count) {
                min_Count = count;
                node = i;
            }
        }
        return node;
    }
}