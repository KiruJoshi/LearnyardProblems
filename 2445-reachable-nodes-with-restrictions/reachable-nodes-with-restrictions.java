class Solution {
    int count = 0;
    List<List<Integer>> adj;

    public void dfs(int curr, int par, int[] restricted) {
        if (isPresent(restricted, curr) == false)
            ++count;
        else
            return;
        for (int i = 0; i < adj.get(curr).size(); i++) {
            int nb = adj.get(curr).get(i);
            if (nb == par)
                continue;
            dfs(nb, curr, restricted);
        }
    }

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            adj.get(node1).add(node2);
            adj.get(node2).add(node1);
        }
        dfs(0, -1, restricted);
        return count;
    }

    public boolean isPresent(int[] restricted, int num) {
        for (int i = 0; i < restricted.length; i++) {
            if (num == restricted[i])
                return true;
        }
        return false;
    }
}