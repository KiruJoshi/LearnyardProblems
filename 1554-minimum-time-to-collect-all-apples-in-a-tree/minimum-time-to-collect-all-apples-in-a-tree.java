class Solution {
    int ans=0;
    List<List<Integer> > adj;
     public void dfs(int source, int parent, List<Boolean> hasApple){
        for(int i=0;i<adj.get(source).size();i++){
          if (adj.get(source).get(i) == parent)
                continue;
            dfs(adj.get(source).get(i), source, hasApple);
             if(hasApple.get(adj.get(source).get(i))) {
                hasApple.set(source, true);
                ans += 2; 
            } 
        }
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
      adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
     ans=0;
     for(int i=0;i<n-1;i++){
        int u=edges[i][0];
        int v=edges[i][1];
         adj.get(v).add(u);
          adj.get(u).add(v);
     }
      dfs(0, -1, hasApple); // Run DFS
        return ans;
    }
}
