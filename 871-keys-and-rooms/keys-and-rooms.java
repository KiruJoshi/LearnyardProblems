class Solution {
     List<List<Integer>> adj;
    boolean[] visited;
    public void dfs(int curr) {
        visited[curr] = true;
        for(int i=0;i<adj.get(curr).size();i++) {
            int nb=adj.get(curr).get(i);
            if(visited[nb] == true)
                continue;
            dfs(nb);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        adj=new ArrayList<>();
        for(int i=0;i<rooms.size();i++){
            adj.add(new ArrayList<>());
        }
        int n=rooms.size();
        visited=new boolean[n];
        for(int i=0;i<rooms.size();i++){
            for(int j=0;j<rooms.get(i).size();j++){
            adj.get(i).add(rooms.get(i).get(j));
            }
       
        } 
        dfs(0);
        for(boolean val:visited){
            if(val==false)
             return false;
        }  
        return true;
    }
}  

 