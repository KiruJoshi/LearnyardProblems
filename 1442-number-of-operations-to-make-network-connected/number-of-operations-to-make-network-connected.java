class Solution {
    List<List<Integer>> adj;
    boolean visited[];
    public void dfs(int current){
    for(int i=0;i<adj.get(current).size();i++){
        int nb=adj.get(current).get(i);
        if(visited[nb]) continue;
        visited[nb]=true;
        dfs(nb);
      }
    }
    public int makeConnected(int n, int[][] connections) {
      adj=new ArrayList<>();
      visited=new boolean[n];
      if((n-1)>connections.length) return -1;
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
      }  
      for(int i=0;i<connections.length;i++){
        int p = connections[i][0];
        int q = connections[i][1];
        adj.get(p).add(q);
        adj.get(q).add(p);
      }
     int ans = 0;
        for(int i=0; i<n; i++) {
            if(visited[i] == false) {
                ans++;
                dfs(i);
            }
        }
        return ans-1;
    }
}