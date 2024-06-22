class Edge {
    int node;
    double weight;
    Edge(int n, double w) {
        node = n;
        weight = w;
    }
}

class Node {
    int node;
    double dist;
    Node(int n, double d) {
        node = n;
        dist = d;
    }
}
class Solution {
    List<List<Edge>> adjList;
    public double[] dijsktra(int src,int n){
        double d[] = new double[n+1];
        Arrays.fill(d,Double.MIN_VALUE);
        d[src] = 1d;
        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
            public int compare(Node n1, Node n2){
                if(n1.dist < n2.dist) return 1;
                else if(n1.dist== n2.dist && n1.node == n2.node) return 0;
                return -1;
            }
        });
        pq.add(new Node(src, 1d));
        while(!pq.isEmpty()){
            int curNum = pq.peek().node;
            double curDist = pq.poll().dist;
            for(Edge e:adjList.get(curNum)){
                int nb = e.node;
                double w = e.weight;
                if(d[nb] < (double)(d[curNum] * w)){
                    d[nb] = d[curNum] * w;
                    pq.add(new Node(nb, d[nb]));
                }
            }
        }
        return d;
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        adjList = new ArrayList<>();
        for(int i=0;i<=n;i++)
            adjList.add(new ArrayList<>());

        int idx = 0;
        for(int[] arr:edges){
            int u = arr[0];
            int v = arr[1];
            double w = succProb[idx];
            adjList.get(u).add(new Edge(v,w));
            adjList.get(v).add(new Edge(u,w));
            ++idx;
        }
        double d[] = dijsktra(start_node,n);
        if(d[end_node] == Double.MIN_VALUE) return 0;
        return d[end_node];
    }
}
